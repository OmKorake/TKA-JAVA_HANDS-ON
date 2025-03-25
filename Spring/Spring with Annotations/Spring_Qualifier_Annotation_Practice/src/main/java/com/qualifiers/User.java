package com.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Qualifier("ccard")
	@Autowired
	private Payment method1;
	
	@Qualifier("dcard")
	@Autowired
	private Payment method2;

	public Payment getMethod1() {
		return method1;
	}

	public void setMethod1(Payment method1) {
		this.method1 = method1;
	}

	public Payment getMethod2() {
		return method2;
	}

	public void setMethod2(Payment method2) {
		this.method2 = method2;
	}

	@Override
	public String toString() {
		return "User [method1=" + method1 + ", method2=" + method2 + "]";
	}

	

}
