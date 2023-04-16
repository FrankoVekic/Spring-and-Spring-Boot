package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Exercise"), 
				new Course(2, "Learn DevOps", "Exercise"),
				new Course(3, "Learn Azure", "Exercise"),
				new Course(4, "Learn GCP", "Exercise"));
	}
}
