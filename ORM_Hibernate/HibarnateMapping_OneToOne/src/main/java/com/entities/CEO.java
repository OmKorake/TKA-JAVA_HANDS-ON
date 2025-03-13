package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CEO {

	@Id
	private int ceo_id;
	private String ceo_name;

	public CEO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CEO(int ceo_id, String ceo_name) {
		super();
		this.ceo_id = ceo_id;
		this.ceo_name = ceo_name;
	}

	public int getCeo_id() {
		return ceo_id;
	}

	public void setCeo_id(int ceo_id) {
		this.ceo_id = ceo_id;
	}

	public String getCeo_name() {
		return ceo_name;
	}

	public void setCeo_name(String ceo_name) {
		this.ceo_name = ceo_name;
	}

	@Override
	public String toString() {
		return "CEO [ceo_id=" + ceo_id + ", ceo_name=" + ceo_name + "]";
	}

}