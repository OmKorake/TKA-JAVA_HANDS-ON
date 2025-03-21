package com.entities;

import org.springframework.stereotype.Component;

@Component

public class Car {

	private int cid;
	private String company;
	private String model;
	private String price;
	private String color;
	private int year;
	private String fueltype;

	public Car() {

	}

	public Car(int cid, String company, String model, String price, String color, int year, String fueltype) {
		super();
		this.cid = cid;
		this.company = company;
		this.model = model;
		this.price = price;
		this.color = color;
		this.year = year;
		this.fueltype = fueltype;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", company=" + company + ", model=" + model + ", price=" + price + ", color=" + color
				+ ", year=" + year + ", fueltype=" + fueltype + "]";
	}

}
