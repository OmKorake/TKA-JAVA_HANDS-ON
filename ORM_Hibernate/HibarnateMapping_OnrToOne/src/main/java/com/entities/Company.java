package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Company {

	@Id
	private int id;
	private String company_name;
	@OneToOne
	private CEO ceo;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String company_name, CEO ceo) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.ceo = ceo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public CEO getCeo() {
		return ceo;
	}

	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", company_name=" + company_name + ", ceo=" + ceo + "]";
	}

}
