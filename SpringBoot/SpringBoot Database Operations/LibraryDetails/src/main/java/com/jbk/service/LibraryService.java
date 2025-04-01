package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.LibraryDao;
import com.jbk.entity.Library;

@Service
public class LibraryService {

	@Autowired
	LibraryDao ld;

	public String insertData(Library l) {
		String str = ld.insertData(l);
		return str;

	}
	
	public String deletyeData(int id) {
		String str = ld.deleteData(id);
		return str;
	}
	
	public String updateData(Library l , int id) {
		String str = ld.updateData(l, id);
		return str;
	}

}
