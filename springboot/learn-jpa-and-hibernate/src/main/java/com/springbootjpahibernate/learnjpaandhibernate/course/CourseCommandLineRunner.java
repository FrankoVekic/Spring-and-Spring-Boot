package com.springbootjpahibernate.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootjpahibernate.learnjpaandhibernate.course.Course;
import com.springbootjpahibernate.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.springbootjpahibernate.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1, "Learn AWS Jpa!", "Franko"));
		repository.insert(new Course(2, "Learn Azure Jpa!", "Franko"));
		repository.insert(new Course(3, "Learn DevOps Jpa!", "Franko"));

		repository.deleteById(1);

		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
