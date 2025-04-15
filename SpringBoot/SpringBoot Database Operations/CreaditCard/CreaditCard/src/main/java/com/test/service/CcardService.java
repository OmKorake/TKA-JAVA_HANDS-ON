package com.test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CcardDao;
import com.test.entity.CreaditCard;

@Service
public class CcardService {
	
	@Autowired
	CcardDao cd;
	
	public String insertData(CreaditCard c) {
		String str = cd.insertData(c);
		return str;
		
	}
	
	public List<CreaditCard> getallData(CreaditCard c) {
		List<CreaditCard> str = cd.getAlldata(c);
		return str;
	}
	
	public CreaditCard getpertData(Date expirydata) {
		CreaditCard c = cd.getpertiData(expirydata);
		return c;
		
	}
	


}
