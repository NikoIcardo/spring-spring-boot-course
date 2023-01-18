package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


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
    
    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
    	// parameters using beans need to use the assigned name of the bean
    	// note that these are auto wired. 
    	return new Person(name, age, address3); 
    }
    
    @Bean(name = "address2")
    public Address address() {
    	return new Address("101 Main St.", "Seattle");
    }
    @Bean(name = "address3")
    public Address address3() {
    	return new Address("101 Main St.", "Seattle");
    }
     
}
