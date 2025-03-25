package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.RechargeConfig;
import com.entity.Recharge;

public class RechargeMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RechargeConfig.class);
		Recharge r = context.getBean(Recharge.class);
		r.myRecharge();
		
	}

}
