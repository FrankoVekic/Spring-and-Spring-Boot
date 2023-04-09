package com.learn.springframework;

import com.learn.springframework.game.GameRunner;
import com.learn.springframework.game.MarioGame;
import com.learn.springframework.game.PacmanGame;
import com.learn.springframework.game.SuperContraGame;

public class AppGaming {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
