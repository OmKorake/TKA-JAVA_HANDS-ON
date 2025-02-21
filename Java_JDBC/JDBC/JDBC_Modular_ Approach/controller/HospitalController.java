package com.controller;

import com.service.HospitalService;

public class HospitalController {

	public static void main(String[] args) throws Exception {
		HospitalService hs = new HospitalService();
//		hs.createData();
//		hs.insertData();
//		hs.updateData();
//		hs.deleteData();
		hs.getallData();
//		
		


	}

}
