package com.controller;

import com.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		
		TeacherService ts = new TeacherService();
//		ts.insertData();
//		ts.updateData();
//		ts.getsingaleData();
//		ts.getallData();
		ts.deleteData();
		
	}

}
