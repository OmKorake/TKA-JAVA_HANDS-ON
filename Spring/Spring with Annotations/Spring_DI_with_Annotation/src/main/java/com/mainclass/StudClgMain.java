package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.StudClgConfig;
import com.entities.Student;

public class StudClgMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudClgConfig.class);
		Student s = context.getBean(Student.class);
		System.out.println(s);
	}

}
