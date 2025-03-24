package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {

	@Value("1500")
	private int cid;
	@Value("GPS")
	private String cname;
	@Value("Solapur")
	private String city;

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collage(int cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}

}
