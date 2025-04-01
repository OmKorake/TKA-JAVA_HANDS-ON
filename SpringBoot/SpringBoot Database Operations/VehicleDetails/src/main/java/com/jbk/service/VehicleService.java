package com.jbk.service;

import java.util.List;


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
	
	public Vehicle getSingleRecord(int id) {
		Vehicle v = dao.getSingleRecord(id);
		return v;
	}
	
	public List<Object> getAllRecord(Vehicle v) {
		List<Object> list = dao.getAllRecord(v);
		return list;
	}

}
