package com.employees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="EmpRec")
public class Employees {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String email; 
	private String role;
//	@Column(name="Salary")
	private int sal;
	private String city;	
	private String state;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int id, String name, String gender, String email, String role, int sal, String city,
			String state) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.role = role;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Employees [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", role=" + role
				+ ", sal=" + sal + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
