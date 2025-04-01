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

import com.jbk.entity.Library;
import com.jbk.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	LibraryService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Library l) {
		String str = service.insertData(l);
		return str;

	}

//	@DeleteMapping("/deletedata/{id}")
//	public String deleteData(@PathVariable int id) {
//		String str = service.deletyeData(id);
//		return str;
//		
//	}

	@DeleteMapping("/deletedata")
	public String deleteData(@RequestParam int id) {
		String str = service.deletyeData(id);
		return str;

	}

	@PutMapping("/updatedata")
	public String updateData(@RequestBody Library l, @RequestParam int id) {
		String str = service.updateData(l, id);
		return str;

	}

	@GetMapping("/getsingledata")
	public Library getSingleRecord(@RequestParam int id) {
		Library l = service.getSingleRecord(id);
		return l;
	}

	@GetMapping("/getalldata")
	public List<Object> getAllRecord(Library l) {
		List<Object> list = service.getAllRecord(l);
		return list;
	}

}
