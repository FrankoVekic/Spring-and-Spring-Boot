package com.learn.springframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {};

//
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Franko";
	}
	
	@Bean
	public int age() {
		return 26;
	}
	
	@Bean
	public Person person() {
		return new Person("Franko", 25, new Address("Rijeke dubrovačke 5","Vinkovci"));
	}
	
	@Bean
	public Person person2MethodCall() {//name,age,addres2
		return new Person(name(),age(), address()); //name, age
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name(),age(), address3()); //name, age
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name(),age(), address()); //name, age
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name(),age(), address()); //name, age
	}
	
	@Bean(name ="address2")
	@Primary
	public Address address() {
		return new Address("Ivana Gundulića 8", "Osijek");
	}
	
	@Bean(name ="address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Vukovarska 50", "Zagreb");
	}
}
