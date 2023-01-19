package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingBasicConfiguration {

	// Want to return each game as a gaming console bean 
	@Bean
	@Primary
	public GamingConsole game1() {
		return new MarioGame();
	}
	
	@Bean
	@Qualifier("SuperContra")
	public GamingConsole game2() {
		return new SuperContraGame();
	}
	
	@Bean
	@Qualifier("PacMan")
	public GamingConsole game3() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner (GamingConsole game) {
		return new GameRunner(game); 
	}
}
