package com.learn.springframework;

import com.learn.springframework.game.GameRunner;
import com.learn.springframework.game.MarioGame;

public class AppGaming {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
