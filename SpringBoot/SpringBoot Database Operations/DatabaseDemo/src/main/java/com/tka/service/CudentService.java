package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.CudentDao;
import com.tka.entity.Cudent;

@Service
public class CudentService {

	@Autowired
	CudentDao dao;

	public String insertData(Cudent c) {
		String msg = dao.insertData(c);
		return msg;

	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Cudent c, int id) {
		String str = dao.updataData(c, id);
		return str;
	}
	
	public Cudent getSingleData(int id) {
		Cudent c = dao.getSingleData(id);
		return c;
	}
	
	public List getAllData(Cudent c) {
		List<Cudent> list = dao.getAlldata(c);
		return list;
	}

}
