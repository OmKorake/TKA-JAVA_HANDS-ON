package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private int vid;
	private String company;
	private String model;
	private int year;
	private String price;
	private String color;
	private String fueltype;

	public Vehicle() {

	}

	public Vehicle(int vid, String company, String model, int year, String price, String color, String fueltype) {
		super();
		this.vid = vid;
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
		this.fueltype = fueltype;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", company=" + company + ", model=" + model + ", year=" + year + ", price="
				+ price + ", color=" + color + ", fueltype=" + fueltype + "]";
	}

}
