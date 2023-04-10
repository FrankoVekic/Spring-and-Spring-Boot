package com.learn.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.springframework.game.GameRunner;
import com.learn.springframework.game.GamingConsole;


@Configuration
@ComponentScan("com.learn.springframework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}		
	}
}
