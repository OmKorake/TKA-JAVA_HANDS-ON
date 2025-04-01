package com.jbk.service;

import java.util.List;

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

	public String updateData(Library l, int id) {
		String str = ld.updateData(l, id);
		return str;
	}

	public Library getSingleData(int id) {
		Library l = ld.getSingleData(id);
		return l;

	}

	public List getAllData(Library l) {
		List<Library> list = ld.getAlldata(l);
		return list;
	}

	public Library getSingleRecord(int id) {
		Library l = ld.getSingleRecord(id);
		return l;
	}

	public List<Object> getAllRecord(Library l) {
		List<Object> list = ld.getAllRecord(l);
		return list;
	}

}
