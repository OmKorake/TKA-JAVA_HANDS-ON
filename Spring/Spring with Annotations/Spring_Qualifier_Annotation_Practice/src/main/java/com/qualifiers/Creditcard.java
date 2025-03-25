package com.qualifiers;

import org.springframework.stereotype.Component;

@Component("ccard")
public class Creditcard implements Payment{

	@Override
	public String pay() {
		
		return "Payment is created...";
		
	}
	

}
