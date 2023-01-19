package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;
import java.util.function.Consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		/* 
		 * Spring Steps
		 * 1. Launch Spring Context -
		 * 2. Configure the things we want spring to manage - @Configuration
		 */ 
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age")); 
			
			System.out.println(context.getBean("person")); 
			
			System.out.println(context.getBean("person2MethodCall"));
			
			// note that to call the bean, we don't need to actually pass the parameters
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5Qaulifier"));
			
			
			// list all spring beans 
			// Package java.util.function  to get Consumer types for lambda functions
			Consumer<String> printName = str -> System.out.println(str); 
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(printName);
		};
			
	}
	

}
 