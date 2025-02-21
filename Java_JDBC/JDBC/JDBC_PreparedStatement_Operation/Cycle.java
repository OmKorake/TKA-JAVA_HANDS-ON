package com.prepstetment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cycle {
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("insert into cycle(id , brand_name , price ,type) values(?,?,?,?)");
		ps.setInt(1, 1001);
		ps.setString(2,"Hero");
		ps.setInt(3, 11500);
		ps.setString(4,"Road");
		
		ps.setInt(1, 1002);
		ps.setString(2, "Hercules");
		ps.setInt(3, 14800);
		ps.setString(4, "Fitness");
		
		ps.setInt(1, 1003);
		ps.setString(2, "Atlas");
		ps.setInt(3, 17200);
		ps.setString(4, "Hybrid");
		
		ps.setInt(1, 1004);
		ps.setString(2, "Trek");
		ps.setInt(3, 25900);
		ps.setString(4, "Mountain");
		
		ps.setInt(1, 1005);
		ps.setString(2, "Allwyn");
		ps.setInt(3, 20300);
		ps.setString(4, "Fitness");
		
		ps.executeUpdate();		
		System.out.println("Data is inserted Successfully...");
		
	}
	
	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("update cycle set brand_name=? where id=?");
		ps.setInt(2,1004);
		ps.setString(1, "BSA");
		ps.executeUpdate();
		System.out.println("Data is updated Successfully....");
		c.close();
		
	}
	
public void deletData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("delete from cycle where brand_name=?");
		ps.setString(1, "Hero");
		ps.executeUpdate();
		System.out.println("Data is deleted Successfully....");
		c.close();
	}

	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("select * from cycle");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getString(4));
		}
		c.close();
		
	}

}
