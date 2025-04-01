package com.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.dao.StudentDao;
import com.stud.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao sdao;

	public String insertData(Student s) {
		String str = sdao.insertData(s);
		return str;

	}

	public String deleteData(int id) {
		String str = sdao.deleteData(id);
		return str;

	}

	public String updateData(Student s, int id) {
		String str = sdao.updateData(s, id);
		return str;

	}

}
