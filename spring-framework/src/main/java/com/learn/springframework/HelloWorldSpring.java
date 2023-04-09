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
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		//System.out.println(context.getBean(Address.class));
	}

}
