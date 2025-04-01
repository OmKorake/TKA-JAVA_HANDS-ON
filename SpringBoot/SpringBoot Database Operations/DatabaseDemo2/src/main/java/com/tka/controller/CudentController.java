package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tka.entity.Cudent;
import com.tka.service.CudentService;

@RestController
public class CudentController {

	@Autowired
	CudentService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Cudent c) {
		String msg = service.insertData(c);
		return msg;

	}
	
//	@DeleteMapping("/deletedata/{id}")
//	public String deleteData(@PathVariable int id) {
//		String msg =service.deleteData(id);
//		return msg;
//	}
	
	@DeleteMapping("deletedata2")
	public String deleteData(@RequestParam int id) {
		String msg = service.deleteData(id);
		return msg;
		
	}
	
	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Cudent c,@PathVariable int id) {
		String str = service.updateData(c, id);
		return str;
	}

}
