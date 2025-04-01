package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmpDao;
import com.jbk.entity.Employee;

@Service
public class EmpService {

	@Autowired
	EmpDao ed;

	public String insertData(Employee e) {

		String str = ed.insertData(e);
		return str;
	}

	public String deleteData(int id) {
		String str = ed.deleteData(id);
		return str;

	}
	
	public String updateData(Employee e,int id) {
		String str = ed.updateData(e, id);
		return str;
	}
	
	
	

}
