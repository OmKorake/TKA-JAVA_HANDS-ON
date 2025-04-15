package com.test.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CreaditCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cvv;
	private int ccnumber;
	private String fname;
	private Date expirydata;
	public CreaditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreaditCard(int id, int cvv, int ccnumber, String fname, Date expirydata) {
		super();
		this.id = id;
		this.cvv = cvv;
		this.ccnumber = ccnumber;
		this.fname = fname;
		this.expirydata = expirydata;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getCcnumber() {
		return ccnumber;
	}
	public void setCcnumber(int ccnumber) {
		this.ccnumber = ccnumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Date getExpirydata() {
		return expirydata;
	}
	public void setExpirydata(Date expirydata) {
		this.expirydata = expirydata;
	}
	@Override
	public String toString() {
		return "CreaditCard [id=" + id + ", cvv=" + cvv + ", ccnumber=" + ccnumber + ", fname=" + fname
				+ ", expirydata=" + expirydata + "]";
	}
	
	
}