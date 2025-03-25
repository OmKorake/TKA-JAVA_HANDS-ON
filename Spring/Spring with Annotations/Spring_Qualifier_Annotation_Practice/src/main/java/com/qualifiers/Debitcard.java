package com.qualifiers;

import org.springframework.stereotype.Component;

@Component("dcard")
public class Debitcard implements Payment {

	@Override
	public String pay() {
		return "Payment is debeted....";
	}

}
