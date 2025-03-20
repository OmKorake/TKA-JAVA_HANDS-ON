package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Employee;

public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e = context.getBean("e",Employee.class);
		System.out.println(e);

		
	}

}
