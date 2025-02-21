package com.controller;

import com.service.BikeService;

public class BikeController {

	public static void main(String[] args) throws Exception {
		
		BikeService bs = new BikeService();
		bs.createTable();


	}

}
