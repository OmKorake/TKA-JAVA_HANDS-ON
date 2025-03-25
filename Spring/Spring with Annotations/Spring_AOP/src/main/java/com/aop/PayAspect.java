package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PayAspect {
	
	@Before("execution(public void myPayment())")
	public void beforePay() {
		System.out.println("before payment");
	}
	
	@After("execution(public void myPayment())")
	public void afterPay() {
		System.out.println("after payment");
	}
	

}
