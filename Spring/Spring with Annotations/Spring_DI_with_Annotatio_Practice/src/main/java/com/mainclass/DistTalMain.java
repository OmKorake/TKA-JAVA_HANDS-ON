package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.DistTalConfig;
import com.entities.Taluka;

public class DistTalMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DistTalConfig.class);
		Taluka t = context.getBean(Taluka.class);
		t.setTid(10);
		t.setTname("Barshi");
		t.setArea("4225 hectares");
		t.setLanguage("Marathi");
		t.setPopulation(434000);
		t.setPincode(413001);
		System.out.println(t);
		
		
	}

}
