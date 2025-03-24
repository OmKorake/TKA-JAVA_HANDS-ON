package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("23")
	private int sid;
	@Value("Prajwal")
	private String sname;
	@Value("Computer Technology")
	private String dept;
	@Autowired
	private Collage clg;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String dept, Collage clg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
		this.clg = clg;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Collage getClg() {
		return clg;
	}

	public void setClg(Collage clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dept=" + dept + ", clg=" + clg + "]";
	}

}
