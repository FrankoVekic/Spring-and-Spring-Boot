package com.springbootjpahibernate.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootjpahibernate.learnjpaandhibernate.course.Course;
import com.springbootjpahibernate.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.springbootjpahibernate.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.springbootjpahibernate.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "Learn AWS Jpa!", "Franko"));
		repository.save(new Course(2, "Learn Azure Jpa!", "Franko"));
		repository.save(new Course(3, "Learn DevOps Jpa!", "Franko"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
	}

}
