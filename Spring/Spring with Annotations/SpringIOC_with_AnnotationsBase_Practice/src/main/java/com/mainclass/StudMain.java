package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.StudConfi;
import com.entities.Student;

public class StudMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudConfi.class);
		Student s = context.getBean(Student.class);
		System.out.println(s);

		
	}

}
