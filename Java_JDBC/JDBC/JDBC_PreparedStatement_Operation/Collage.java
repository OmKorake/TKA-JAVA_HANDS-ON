package com.prepstetment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Collage {
	
	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into bank(udice_no,clg_name,location) values(?,?,?)");
		ps.setInt(1,7265);
		ps.setString(2, "Government Polytechnic,Solapur");
		ps.setString(3, "Solapur");
		
		ps.setInt(1,7634);
		ps.setString(2, "Sidhant Polytechnic           ");
		ps.setString(3, "Pune");
		
		ps.setInt(1,9562);
		ps.setString(2, "D Y Patil Polytechnic         ");
		ps.setString(3, "Kolhapur");
		
		ps.setInt(1,3652);
		ps.setString(2, "KIT Polytechnic               ");
		ps.setString(3, "Nagapur");
		
		ps.setInt(1,8765);
		ps.setString(2, "A G Polytechnic               ");
		ps.setString(3, "Nashik");

		ps.setInt(1,9244);
		ps.setString(2, "Indira Polytechnic               ");
		ps.setString(3, "Barshi");

		ps.setInt(1,5346);
		ps.setString(2, "Ramakant Polytechnic               ");
		ps.setString(3, "Nagapur");
		
		ps.executeUpdate();
		System.out.println("Data is inserted Successfully...");

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("update collage set udice_no=? where clg_name=?");
		ps.setString(2, "D Y Patil Polytechnic");
		ps.setInt(1, 5362);
		ps.executeUpdate();
		System.out.println("Data is updated Successfully....");
		c.close();

	}

	public void deletData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from collage where udice_no=?");
		ps.setInt(1, 5362);
		ps.executeUpdate();
		System.out.println("Data is deleted Successfully....");
		c.close();
	}

	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from collage");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
		}
		c.close();

	}

}
