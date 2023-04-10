package com.learn.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.springframework.game.GameRunner;
import com.learn.springframework.game.GamingConsole;
import com.learn.springframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	
		@Bean
		public GamingConsole game() {
			var game = new PacmanGame();
			return game;			
		}
		
		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			var gameRunner = new GameRunner(game);
			return gameRunner;			
		}	
	}



