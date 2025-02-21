package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CollagesDao {
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("insert into collage values(7265,'D Y Patil Polytechnic','Solapur')");
		s.executeUpdate("insert into collage values(5423,'A G Patil Polytechnic','Solapur'),"
				+ "(6345,'KIT Polytechnic','Kolhapur'),"
				+ "(9244,'Indira Polytechnic','Barshi'),"
				+ "(5346,'Ramakant Polytechnic','Nagapur'),"
				+ "(7387,'Sidhant Polytechnic','Mumbai')");
		System.out.println("data inserted......");
		c.close();
		
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("update collage set location='Dharashiv' where udice_no=7265");
		System.out.println("data is updated.....");
		c.close();
	}
	
	public void deleteData() throws Exception {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("delete from collage where location='Kolhapur'");
		System.out.println("data is deleted.....");
		c.close();
		
	}
	
	public void getallData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s=c.createStatement();
		ResultSet rs = s.executeQuery("select * from collage");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
		c.close();
	}

}
