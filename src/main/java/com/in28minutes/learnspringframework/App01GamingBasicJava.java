package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

        var game = new MarioGame(); 
		var game1 = new SuperContraGame(); 
        var game2 = new PacManGame(); 
		var gameRunner = new GameRunner(game2); 
		gameRunner.run(); 
	}
}
