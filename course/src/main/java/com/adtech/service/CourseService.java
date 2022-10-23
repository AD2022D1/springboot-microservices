package com.adtech.service;

import java.util.List;

import com.adtech.entity.Course;

public interface CourseService {

	boolean create(Course course);

	Course getById(int courseId);

	List<Course> getAll();

	boolean update(Course course);

	boolean delete(int courseId);

}
