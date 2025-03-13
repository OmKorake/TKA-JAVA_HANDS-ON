package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	@OneToOne
	private Laptop lap;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int sid, String name, Laptop lap) {
		super();
		this.sid = sid;
		this.name = name;
		this.lap = lap;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", lap=" + lap + "]";
	}

}