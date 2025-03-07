package com.pojoexample;

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();
		c.setId(1);
		c.setCno("MH13BE1205");
		c.setCompany("Mahindra");
		c.setModel("Scorpio");
		c.setColor("Black");
		c.setPrice(2000000);
		c.setLonch_year(2024);
		c.setFule_type("Disel");
		c.setSeat_capy(7);
		
		System.out.println(c.getId()+"  "+c.getCno()+"  "+c.getCompany()+"  "+c.getModel()+"  "+c.getColor()+"  "+c.getPrice()+"  "+c.getLonch_year()+"  "+c.getFule_type()+"  "+c.getSeat_capy());

		
	}

}
