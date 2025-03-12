package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cno;
	private String company;
	private String model;
	private String color;
	private int price;
	private int lonch_year;
	private int seat_capy;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String cno, String company, String model, String color, int price, int lonch_year,
			 int seat_capy) {
		super();
		this.id = id;
		this.cno = cno;
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		this.lonch_year = lonch_year;
		this.seat_capy = seat_capy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLonch_year() {
		return lonch_year;
	}
	public void setLonch_year(int lonch_year) {
		this.lonch_year = lonch_year;
	}
	
	public int getSeat_capy() {
		return seat_capy;
	}
	public void setSeat_capy(int seat_capy) {
		this.seat_capy = seat_capy;
	}
	@Override
	public String toString() {   
		return "Car [id=" + id + ", cno=" + cno + ", company=" + company + ", model=" + model + ", color=" + color
				+ ", price=" + price + ", lonch_year=" + lonch_year  + ", seat_capy="
				+ seat_capy + "]";
	}
	
}
