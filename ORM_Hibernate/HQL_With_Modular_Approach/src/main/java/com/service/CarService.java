package com.service;

import com.dao.CarDao;

public class CarService {

	public void insertData() {
		CarDao cd = new CarDao();
		cd.insertData();
	}

	public void updateData() {
		CarDao cd = new CarDao();
		cd.updateData();
	}

	public void deleteData() {
		CarDao cd = new CarDao();
		cd.deleteData();
	}

	public void getsingalData() {
		CarDao cd = new CarDao();
		cd.getsingleData();
	}
	public void getallData() {
		CarDao cd = new CarDao();
		cd.getAllData();
	}

}
