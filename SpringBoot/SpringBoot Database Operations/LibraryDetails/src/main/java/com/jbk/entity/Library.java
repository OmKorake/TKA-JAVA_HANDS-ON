package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String librarianName;
	private String openinghours;
	private String website;
	private int fees;
	private int totalBooks;
	private String address;

	public Library() {

	}

	public Library(int id, String name, String email, String librarianName, String openinghours, String website,
			int fees, int totalBooks, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.librarianName = librarianName;
		this.openinghours = openinghours;
		this.website = website;
		this.fees = fees;
		this.totalBooks = totalBooks;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getOpeninghours() {
		return openinghours;
	}

	public void setOpeninghours(String openinghours) {
		this.openinghours = openinghours;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", email=" + email + ", librarianName=" + librarianName
				+ ", openinghours=" + openinghours + ", website=" + website + ", fees=" + fees + ", totalBooks="
				+ totalBooks + ", address=" + address + "]";
	}

}
