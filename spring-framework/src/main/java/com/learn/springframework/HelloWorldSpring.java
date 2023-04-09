package com.learn.springframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springframework.game.MarioGame;
import com.learn.springframework.game.PacmanGame;
import com.learn.springframework.game.SuperContraGame;

public class HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context 
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want Spring to manage - @Configuration
		//HelloWorldConfiguration - @Configuration
		//name -@Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
			
		
	}

}
