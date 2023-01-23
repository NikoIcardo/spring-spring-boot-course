package com.in28minutes.learnspringframework;

import java.util.Arrays;
import java.util.function.Consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

       try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
    	   System.out.println(context.getBean(GameRunner.class));
    	   
    	   context.getBean(GamingConsole.class).up();
    	   
    	   context.getBean(GameRunner.class).run(); 
    	   
    	   Consumer<String> printToConsole = str -> System.out.println(str); 
    	   
    	   Arrays.stream(context.getBeanDefinitionNames()).forEach(printToConsole); 
       }
	}

}

