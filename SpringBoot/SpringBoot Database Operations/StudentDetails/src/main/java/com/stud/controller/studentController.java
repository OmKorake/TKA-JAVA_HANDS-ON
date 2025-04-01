package com.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stud.entity.Student;
import com.stud.service.StudentService;

@RestController
@RequestMapping("/student")
public class studentController {

	@Autowired
	StudentService service;

	@PostMapping("/studentsavedata")
	public String insertData(@RequestBody Student s) {
		String str = service.insertData(s);
		return str;
	}

//	@DeleteMapping("/deletedata")
//	public String deleteData(@RequestParam int id) {
//		String str = service.deleteData(id);
//		return str;
//
//	}

	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String str = service.deleteData(id);
		return str;

	}

	@PutMapping("/updatedate")
	public String updateData(@RequestBody Student s, @RequestParam int id) {
		String str = service.updateData(s, id);
		return str;

	}

}
