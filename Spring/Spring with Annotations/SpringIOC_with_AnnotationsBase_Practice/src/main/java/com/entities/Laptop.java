package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Laptop {

	@Value("4321")
	private int lid;
	@Value("Lenovo")
	private String brand;
	@Value("Silver")
	private String color;
	@Value("Intel core i3")
	private String processor;
	@Value("SSD")
	private String storagetype;
	@Value("512")
	private int storagesize;
	@Value("8")
	private int ram;
	@Value("40000")
	private int price;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lid, String brand, String color, String processor, String storagetype, int storagesize, int ram,
			int price) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.color = color;
		this.processor = processor;
		this.storagetype = storagetype;
		this.storagesize = storagesize;
		this.ram = ram;
		this.price = price;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getStoragetype() {
		return storagetype;
	}

	public void setStoragetype(String storagetype) {
		this.storagetype = storagetype;
	}

	public int getStoragesize() {
		return storagesize;
	}

	public void setStoragesize(int storagesize) {
		this.storagesize = storagesize;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", color=" + color + ", processor=" + processor
				+ ", storagetype=" + storagetype + ", storagesize=" + storagesize + ", ram=" + ram + ", price=" + price
				+ "]";
	}

}
