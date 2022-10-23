package com.adtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adtech.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
