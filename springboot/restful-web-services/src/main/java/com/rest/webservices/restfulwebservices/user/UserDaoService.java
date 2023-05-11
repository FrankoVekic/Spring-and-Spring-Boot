package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Franko", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Stanko", LocalDate.now().minusYears(35)));
		users.add(new User(3, "Branko", LocalDate.now().minusYears(20)));
	}

	public List<User> findAll() {
		return users;
	}

}
