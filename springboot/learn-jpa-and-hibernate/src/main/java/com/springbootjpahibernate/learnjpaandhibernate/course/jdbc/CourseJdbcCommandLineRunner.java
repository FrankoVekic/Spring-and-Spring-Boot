package com.springbootjpahibernate.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootjpahibernate.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1, "Learn AWS Now!", "Franko"));
		repository.insert(new Course(2, "Learn Azure Now!", "Franko"));
		repository.insert(new Course(3, "Learn DevOps Now!", "Franko"));
		
		repository.delete(1);
	}

}
