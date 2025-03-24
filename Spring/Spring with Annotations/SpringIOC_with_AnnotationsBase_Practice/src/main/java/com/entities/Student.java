package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Student {

	@Value("1")
	private int sid;
	@Value("Prajwal")
	private String sname;
	@Value("prajwal23@gmail.com")
	private String email;
	@Value("20")
	private int age;
	@Value("Dharashiv")
	private String city;

	public Student() {
		
	}

	public Student(int sid, String sname, String email, int age, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.age = age;
		this.city = city;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", age=" + age + ", city=" + city
				+ "]";
	}

}
