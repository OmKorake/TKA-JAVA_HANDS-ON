package com.pojoexample;

public class Hospital {
	private int id;
	private String name;
	private long con_no;
	private String email;
	private String side;
	private int count_doctors;
	private int count_nurses;
	private int count_beds;
	private String address;
	private String city;
	private int pincode;
	private String state;
	private String country;
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(int id, String name, long con_no, String email, String side, int count_doctors, int count_nurses,
			int count_beds, String address, String city, int pincode, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.con_no = con_no;
		this.email = email;
		this.side = side;
		this.count_doctors = count_doctors;
		this.count_nurses = count_nurses;
		this.count_beds = count_beds;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCon_no() {
		return con_no;
	}

	public void setCon_no(long con_no) {
		this.con_no = con_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public int getCount_doctors() {
		return count_doctors;
	}

	public void setCount_doctors(int count_doctors) {
		this.count_doctors = count_doctors;
	}

	public int getCount_nurses() {
		return count_nurses;
	}

	public void setCount_nurses(int count_nurses) {
		this.count_nurses = count_nurses;
	}

	public int getCount_beds() {
		return count_beds;
	}

	public void setCount_beds(int count_beds) {
		this.count_beds = count_beds;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", con_no=" + con_no + ", email=" + email + ", side=" + side
				+ ", count_doctors=" + count_doctors + ", count_nurses=" + count_nurses + ", count_beds=" + count_beds
				+ ", address=" + address + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country="
				+ country + "]";
	}
	

	
	
}
