package com.pojoexample;

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private String email;
	private String role;
	private long phono;
	private int sal;
	private String city;	
	private String state;
	
	public Employee() {
		super();
	}

	public Employee(int id, String fname, String lname, String gender, String email, String role, long phono, int sal,
			String city, String state) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.role = role;
		this.phono = phono;
		this.sal = sal;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getPhono() {
		return phono;
	}

	public void setPhono(long phono) {
		this.phono = phono;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", email="
				+ email + ", role=" + role + ", phono=" + phono + ", sal=" + sal + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
	

}
