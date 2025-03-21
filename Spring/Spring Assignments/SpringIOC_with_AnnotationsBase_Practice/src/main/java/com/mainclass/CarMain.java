package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.CarConfig;
import com.entities.Car;

public class CarMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car c = context.getBean(Car.class);
		c.setCid(121);
		c.setCompany("TATA");
		c.setModel("Swift");
		c.setPrice("7L");
		c.setColor("White");
		c.setYear(2017);
		c.setFueltype("Diesel");
		System.out.println(c);

		
		
		
	}

}
