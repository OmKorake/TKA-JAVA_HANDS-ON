package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class District {

	@Value("13")
	private int did;
	@Value("Solapur")
	private String dname;
	@Value("Maharashtra")
	private String state;

	public District() {
		
	}

	public District(int did, String dname, String state) {
		super();
		this.did = did;
		this.dname = dname;
		this.state = state;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "District [did=" + did + ", dname=" + dname + ", state=" + state + "]";
	}

}
