package com.service;

import com.dao.HospitalDao;

public class HospitalService {

	public void createData() throws Exception {
		HospitalDao hs = new HospitalDao();
		hs.createData();

		
	}

	public void insertData() throws Exception {
		HospitalDao hs1 = new HospitalDao();
		hs1.insertData();


		
	}
	public void updateData() throws Exception {
		HospitalDao hs = new HospitalDao();
		hs.updateData();


		
	}

	public void deleteData() throws Exception {
		HospitalDao hs = new HospitalDao();
		hs.deleteData();


		
	}

	public void getallData() throws Exception {
		HospitalDao hs = new HospitalDao();
		hs.getallData();


		
	}

	
	
	

}
