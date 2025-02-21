package com.service;

import com.dao.BikeDao;

public class BikeService {
	
	public void createTable() throws Exception {
		BikeDao bd = new BikeDao();
		bd.createTable();
	}

}
