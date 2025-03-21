package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.LaptopConfig;
import com.entities.Laptop;

public class LaptopMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop l = context.getBean(Laptop.class);
		System.out.println(l);


	}

}
