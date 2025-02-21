package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BikeDao {

	public void createTable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("create table bike(id int primary key auto_increment ,company_name varchar(40),model varchar(40),price int)");
		ps.execute();
		System.out.println("Table Hospital is created Successfully...");
		c.close();

	}

}
