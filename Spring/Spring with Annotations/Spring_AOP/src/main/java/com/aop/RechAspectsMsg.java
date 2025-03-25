package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RechAspectsMsg {
	
	@Before("execution(public void myRecharge())")
	public void beforRecharge() {
		System.out.println("You are pack is Expiring soon......");
	}

	@After("execution(public void myRecharge())")
	public void afterRecharge() {
		System.out.println("Enjoy your Data pack......");
	}
	
//	@Around("execution (* com.entity.Recharge.*())")
//	public void aroundMsg(ProceedingJoinPoint p) {
//		System.out.println("U R pack is Expiring Soon...");
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("Enjoy U R Data Pack....!");
//	}


	
	

}
