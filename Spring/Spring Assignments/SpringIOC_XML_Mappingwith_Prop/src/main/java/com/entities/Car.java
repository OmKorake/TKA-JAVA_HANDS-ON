package com.entities;

public class Car {

	private int cid;
	private String model;
	private String company;
	private int price;

	private Showroom shorm;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int cid, String model, String company, int price, Showroom shorm) {
		super();
		this.cid = cid;
		this.model = model;
		this.company = company;
		this.price = price;
		this.shorm = shorm;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Showroom getShorm() {
		return shorm;
	}

	public void setShorm(Showroom shorm) {
		this.shorm = shorm;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", model=" + model + ", company=" + company + ", price=" + price + ", shorm=" + shorm
				+ "]";
	}

}
