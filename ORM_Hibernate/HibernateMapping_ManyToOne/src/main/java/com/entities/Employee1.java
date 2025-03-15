package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee1 {

	@Id
	private int empid;
	private String ename;
	private String email;
	@ManyToOne
	private Department dept;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empid, String ename, String email, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.email = email;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", ename=" + ename + ", email=" + email + ", dept=" + dept + "]";
	}

}
