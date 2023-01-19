package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Records store values
record Person(String name, int age, Address address) {}; 
record Address(String firstLine, String city) {}; 

// where you define beans and your spring configuration
@Configuration
public class HelloWorldConfiguration {
	// spring manages beans
	
	// beans 
	@Bean
	public String name() {
		return "Niko"; 
	}
	
	@Bean
	public int age() {
		return 25; 
	}
	
    @Bean 
    public Person person() {
    	return new Person(name(), age(), new Address("101 Main St.", "Seattle")); 
    }
    
    // The following person methods are important to note because you can use existing beans to create new beans 
    @Bean
    public Person person2MethodCall() {
    	return new Person(name(), age(), address()); 
    }
    
    // Using parameters grabs the beans in which return the value mentioned
    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
    	// parameters using beans need to use the assigned name of the bean
    	// note that these are auto wired. 
    	return new Person(name, age, address3); 
    }
    
    // when numerous beans are available for one call, use the Primary or qualifier tags to indicate which ones to use. 
    @Bean
    @Primary 
    public Person person4Parameters(String name, int age, Address addr) {
    	// parameters using beans need to use the assigned name of the bean
    	// note that these are auto wired. 
    	return new Person(name, age, addr); 
    }
    
    @Bean
    public Person person5Qaulifier(String name, int age, @Qualifier("address3qualifier") Address address) {
    	// parameters using beans need to use the assigned name of the bean
    	// note that these are auto wired. 
    	return new Person(name, age, address); 
    }
    
    @Bean(name = "address2")
    @Primary
    public Address address() {
    	return new Address("101 Main St.", "Seattle");
    }
    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
    	return new Address("101 Main St.", "Seattle");
    }
     
}
