package com.jbk.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Vehicle;
import com.jbk.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	VehicleService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Vehicle v) {
		String str = service.insertData(v);
		return str;
	}

	@DeleteMapping("/deletedata")
	public String deleteData(@RequestParam int id) {
		String str = service.deleteData(id);
		return str;
	}

	@PutMapping("/updatedata")
	public String updataData(@RequestBody Vehicle v, @RequestParam int id) {
		String str = service.updateData(v, id);
		return str;
	}
	
	@GetMapping("/getsingledata")
	public Vehicle getSingleRecord(@RequestParam int id) {
		Vehicle v = service.getSingleRecord(id);
		return v;
	}
	
	@GetMapping("/getalldata")
	public List<Object> getAllRecord(Vehicle v) {
		List<Object> list = service.getAllRecord(v);
		return list;
	}

}
