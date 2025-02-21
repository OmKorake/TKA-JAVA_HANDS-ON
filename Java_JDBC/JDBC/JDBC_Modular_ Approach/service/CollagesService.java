package com.service;

import com.dao.CollagesDao;

public class CollagesService {
	
	public void insertData() throws Exception {
		
		CollagesDao cd = new CollagesDao();
		cd.insertData();
		
		
	}

	public void updateData() throws Exception {
		CollagesDao cd1= new CollagesDao();
		cd1.updateData();
		
		
	}

	public void deleteData() throws Exception {
		CollagesDao cd2= new CollagesDao();
		cd2.deleteData();
		
	}

	public void getallData() throws Exception {
		CollagesDao cd1= new CollagesDao();		
		cd1.getallData();
	}

}
