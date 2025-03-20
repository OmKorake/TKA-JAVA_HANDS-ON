package com.entities;

public class Student {

	private int sid;
	private String sname;
	private int age;
	private String city;

	private Collage coll;

	public Student() {

	}

	public Student(int sid, String sname, int age, String city, Collage coll) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.city = city;
		this.coll = coll;
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

	public Collage getColl() {
		return coll;
	}

	public void setColl(Collage coll) {
		this.coll = coll;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", city=" + city + ", coll=" + coll + "]";
	}

}
