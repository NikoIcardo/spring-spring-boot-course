package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// where you define beans and your spring configuration
@Configuration
public class HelloWorldConfiguration {
	// spring manages beans
	
	// beans 
	@Bean
	public String name() {
		return "Niko"; 
	}

}
