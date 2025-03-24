package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.EmpCountryConfig;
import com.entities.Employee;

public class EmpCountryMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpCountryConfig.class);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
		
	}

}
