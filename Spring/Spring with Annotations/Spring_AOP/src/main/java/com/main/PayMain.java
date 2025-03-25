package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.PayConfig;
import com.entity.Payment;
import com.entity.Recharge;

public class PayMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PayConfig.class);
		Payment p = context.getBean(Payment.class);
		p.myPayment();

		
	}
	


}
