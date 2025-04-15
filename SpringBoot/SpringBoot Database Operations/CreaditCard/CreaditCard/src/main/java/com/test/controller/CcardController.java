package com.test.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.CreaditCard;
import com.test.service.CcardService;

@RestController
@RequestMapping("/ccard")
public class CcardController {
	
	@Autowired
	CcardService cs;
	
	@PostMapping("/insertdata")
	public String insertData(@RequestBody CreaditCard c) {
		String str = cs.insertData(c);
		return str;
		
	}
	
	@GetMapping("/getalldata")
	public List<CreaditCard> getallData(CreaditCard c) {
		List<CreaditCard> str = cs.getallData(c);
		return str;
		
	}
	
	@GetMapping("/getpertidata/{expirydata}")
	public CreaditCard getpertiData(@PathVariable Date expirydata) {
		CreaditCard c =cs.getpertData(expirydata);
		return c;
		
	}
	


}
