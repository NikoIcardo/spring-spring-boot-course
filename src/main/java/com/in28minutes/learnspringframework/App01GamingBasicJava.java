package com.in28minutes.learnspringframework;

import java.util.Arrays;
import java.util.function.Consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

       try (var context = new AnnotationConfigApplicationContext(GamingBasicConfiguration.class)){
    	   System.out.println(context.getBean("gameRunner"));
    	   
    	   Consumer<String> printToConsole = str -> System.out.println(str); 
    	   
    	   Arrays.stream(context.getBeanDefinitionNames()).forEach(printToConsole); 
       }
	}

}
