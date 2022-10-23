package com.adtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		System.out.println(" CourseApplication -> main() starts");
		SpringApplication.run(CourseApplication.class, args);
	}

}
