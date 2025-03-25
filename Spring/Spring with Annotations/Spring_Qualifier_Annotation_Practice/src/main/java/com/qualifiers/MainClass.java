package com.qualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		User u = context.getBean(User.class);
		System.out.println(u.getMethod1().pay());
		System.out.println(u.getMethod2().pay());
	}

}
