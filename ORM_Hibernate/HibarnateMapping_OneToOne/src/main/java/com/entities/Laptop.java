package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String name;
	public Laptop() {
		
	}
	public Laptop(int lid, String name) {
		super();
		this.lid = lid;
		this.name = name;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name + "]";
	}

	

}
