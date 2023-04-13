package com.learn.springframework.examples.excercise01;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.springframework.game.GamingConsole;

@Configuration
@ComponentScan
public class BusinessCalculationServiceContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(
				BusinessCalculationServiceContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BuisnessCalculationService.class).findMax());

		}
	}
}
