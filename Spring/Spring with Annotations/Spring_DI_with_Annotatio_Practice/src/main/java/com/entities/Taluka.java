package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Taluka {

	private int tid;
	private String tname;
	private String area;
	private String language;
	private int population;
	private int pincode;
	@Autowired
	private District dist;

	public Taluka() {

	}

	public Taluka(int tid, String tname, String area, String language, int population, int pincode, District dist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.area = area;
		this.language = language;
		this.population = population;
		this.pincode = pincode;
		this.dist = dist;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public District getDist() {
		return dist;
	}

	public void setDist(District dist) {
		this.dist = dist;
	}

	@Override
	public String toString() {
		return "Taluka [tid=" + tid + ", tname=" + tname + ", area=" + area + ", language=" + language + ", population="
				+ population + ", pincode=" + pincode + ", dist=" + dist + "]";
	}

}
