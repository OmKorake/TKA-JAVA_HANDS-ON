package com.controller;

import com.service.CollagesService;

public class CollagesController {
	
	public static void main(String[] args) throws Exception {
		
		CollagesService cs = new CollagesService();
//		cs.insertData();
//		cs.updateData();
//		cs.deleteData();
		cs.getallData();
	}

}
