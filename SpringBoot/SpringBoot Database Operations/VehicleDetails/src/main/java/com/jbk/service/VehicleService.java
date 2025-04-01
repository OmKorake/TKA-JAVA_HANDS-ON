package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.VehicleDao;
import com.jbk.entity.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDao dao;

	public String insertData(Vehicle v) {
		String str = dao.insertData(v);
		return str;

	}

	public String deleteData(int id) {
		String str = dao.deleteData(id);
		return str;

	}

	public String updateData(Vehicle v, int id) {
		String str = dao.updateData(v, id);
		return str;
	}

}
