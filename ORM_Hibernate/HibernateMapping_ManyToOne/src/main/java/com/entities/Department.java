package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int did;
	private String dname;
	private String head;

	@OneToMany
	private List<Employee1> epm;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, String head, List<Employee1> epm) {
		super();
		this.did = did;
		this.dname = dname;
		this.head = head;
		this.epm = epm;
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

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public List<Employee1> getEpm() {
		return epm;
	}

	public void setEpm(List<Employee1> epm) {
		this.epm = epm;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", head=" + head + ", epm=" + epm + "]";
	}

}
