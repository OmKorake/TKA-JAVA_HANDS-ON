package com.jbk.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Employee;
import com.jbk.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmpService service;

	@PostMapping("/empsavedata")
	public String insertData(@RequestBody Employee e) {
		String str = service.insertData(e);
		return str;
	}

//	@DeleteMapping("/deletedata")
//	public String deleteData(@RequestParam int id) {
//		String str = service.deleteData(id);
//		return str;
//
//	}

	@DeleteMapping("/deletedata2/{id}")
	public String deleteData(@PathVariable int id) {
		String str = service.deleteData(id);
		return str;

	}

	@PutMapping("/updatedata")
	public String updateData(@RequestBody Employee e, @RequestParam int id) {
		String str = service.updateData(e, id);
		return str;
	}
	
	@GetMapping("/getsingledata")
	public Employee getSingleRecord(@RequestParam int id) {
		Employee e = service.getSingleRecord(id);
		return e;
	}
	
	@GetMapping("/getalldata")
	public List<Object> getAllRecord(Employee e) {
		List<Object> list = service.getAllRecord(e);
		return list;
	}

}
