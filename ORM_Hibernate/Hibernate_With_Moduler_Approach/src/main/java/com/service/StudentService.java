package com.service;

import com.dao.StudentDao;

public class StudentService {
	
	StudentDao sd = new StudentDao();
	public void insertData() {
	sd.insertData();	
	}
	
	public void updateData() {
		sd.updateData();
	}
	public void deleteData() {
		sd.deleteData();
	}
	public void GetPartiData() {
		sd.GetPertiData();
	}
	public void GetAllData() {
		sd.GetAllData();
		
	}
	

}
