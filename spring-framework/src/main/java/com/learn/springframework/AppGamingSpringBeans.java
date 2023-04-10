package com.learn.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springframework.game.GameRunner;
import com.learn.springframework.game.GamingConsole;
import com.learn.springframework.game.MarioGame;
import com.learn.springframework.game.PacmanGame;
import com.learn.springframework.game.SuperContraGame;

public class AppGamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
					(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}		
	}
}
