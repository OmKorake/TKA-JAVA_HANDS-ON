package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("111")
	private int eid;
	@Value("Prajwal")
	private String ename;
	@Value("prajwal23@gmail.com")
	private String email;
	@Value("25000")
	private String salary;
	@Value("20")
	private int age;
	@Value("Dharashiv")
	private String city;
	
	@Autowired
	private Country con;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String email, String salary, int age, String city, Country con) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.salary = salary;
		this.age = age;
		this.city = city;
		this.con = con;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + ", age=" + age
				+ ", city=" + city + ", con=" + con + "]";
	}

}
