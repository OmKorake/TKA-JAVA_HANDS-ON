package com.service;

import com.dao.TeacherDao;
import com.entity.Teacher;

public class TeacherService {
	
	public void insertData() {
		TeacherDao td = new TeacherDao();
		td.insertData();
	}
	public void updateData() {
		TeacherDao td = new TeacherDao();
		td.updateData();
	}
	public void getsingaleData() {
		TeacherDao td = new TeacherDao();
		td.getsingleData();
	}
	
	public void getallData() {
		TeacherDao td = new TeacherDao();
		td.getallData();
	}
	public void deleteData() {
		TeacherDao td = new TeacherDao();
		td.deleteData();
	}

}
