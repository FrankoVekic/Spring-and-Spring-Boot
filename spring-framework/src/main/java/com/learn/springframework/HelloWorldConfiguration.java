package com.learn.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {};
record Adress(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Franko";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Franko", 25);
	}
	
	@Bean
	public Adress adress() {
		return new Adress("Ivana Gundulića 8", "Osijek");
	}
}
