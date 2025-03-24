package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("91")
	private int cid;
	@Value("India")
	private String name;

	public Country() {

	}

	public Country(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + "]";
	}
}
