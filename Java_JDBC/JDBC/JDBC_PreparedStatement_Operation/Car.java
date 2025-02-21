package com.prepstetment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Car {

	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("insert into car(c_no,company_name,model_name,color,year) values(?,?,?,?,?)");
		ps.setInt(1,9283);
		ps.setString(2, "Tata");
		ps.setString(3, "Punch");
		ps.setString(4, "White");
		ps.setInt(5, 2021);
		
//		ps.setInt(1,7465);
//		ps.setString(2, "Honda");
//		ps.setString(3, "Accord");
//		ps.setString(4, "Green");
//		ps.setInt(5, 2020);
		
//		ps.setInt(1,9999);
//		ps.setString(2, "Mahindra");
//		ps.setString(3, "Scorpio N");
//		ps.setString(4, "Black");
//		ps.setInt(5, 2025);
//		
//		ps.setInt(1,4444);
//		ps.setString(2, "Mahindra");
//		ps.setString(3, "Thar");
//		ps.setString(4, "Napoli Black");
//		ps.setInt(5, 2024);
		
		ps.executeUpdate();		
		System.out.println("Data is inserted Successfully...");
		
	}
 
	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("update car set c_no=? where model_name=?");
		ps.setString(2, "Thar");
		ps.setInt(1, 1111);
		ps.executeUpdate();
		System.out.println("Data is updated Successfully....");
		c.close();
	}
	
	public void deletData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("delete from car where company_name=?");
		ps.setString(1, "Honda");
		ps.executeUpdate();
		System.out.println("Data is deleted Successfully....");
		c.close();
	}

	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("select * from car");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5));
		}
		c.close();
		
	}
	
	

}
