package com.springbootjpahibernate.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}
