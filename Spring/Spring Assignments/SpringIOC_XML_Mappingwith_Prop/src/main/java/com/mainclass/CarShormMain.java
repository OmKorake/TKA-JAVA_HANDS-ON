package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Car;

public class CarShormMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Car c = context.getBean("cr",Car.class);
		System.out.println(c);
	}

}
