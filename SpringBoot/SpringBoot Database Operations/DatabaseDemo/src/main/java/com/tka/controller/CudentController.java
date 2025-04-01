package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

	@DeleteMapping("deletedata2")
	public String deleteData(@RequestParam int id) {
		String msg = service.deleteData(id);
		return msg;

	}

	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Cudent c, @PathVariable int id) {
		String str = service.updateData(c, id);
		return str;
	}

	@PostMapping("/savedata")
	public String insertData(@RequestBody Cudent c) {
		String msg = service.insertData(c);
		return msg;

	}

	@GetMapping("/getsingledata")
	public Cudent getSingleData(@RequestParam int id) {
		Cudent c = service.getSingleData(id);
		return c;
	}

	@GetMapping("/getalldata")
	public List<Cudent> getAllData(Cudent c) {
		List<Cudent> list = service.getAllData(c);
		return list;
	}

}
