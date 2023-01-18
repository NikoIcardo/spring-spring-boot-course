package com.in28minutes.learnspringframework;

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
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class); 
		System.out.println(context.getBean("name"));
		
	}

}
