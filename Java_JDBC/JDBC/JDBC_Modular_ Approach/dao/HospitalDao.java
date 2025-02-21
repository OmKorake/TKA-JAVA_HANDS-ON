package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HospitalDao {
	
	public void createData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("create table hospitals(id int primary key auto_increment,h_name varchar(40),capacity int,city varchar(40))");
		ps.execute();
		System.out.println("Table Hospitals is created Successfully...");
		c.close();

	}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("insert into hospitals(h_name,capacity,city) values(?,?,?)");
        ps.setString(1, "Osic Hospital");
        ps.setInt(2, 550);
        ps.setString(3, "Mumbai");
        
        ps.setString(1, "City Center Hospital");
        ps.setInt(2, 350);
        ps.setString(3, "Solapur");
        
        ps.setString(1, "Swastik Hospital");
        ps.setInt(2, 200);
        ps.setString(3, "Barshi");
        
        ps.setString(1, "New Patil Hospital");
        ps.setInt(2, 100);
        ps.setString(3, "Kolhapur");
        
        ps.setString(1, "Chavhan Hospital");
        ps.setInt(2, 150);
        ps.setString(3, "Vairag");
        
        ps.setString(1, "OSAM Hospital");
        ps.setInt(2, 450);
        ps.setString(3, "Pune");
        
        ps.execute();
        System.out.println("In table Hospital data is inserted Successfully......");
        c.close();
       
	}
	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("update hospitals set h_name=? where city=?");
		ps.setString(2, "Kolhapur");
		ps.setString(1, "Desai");
		ps.executeUpdate();
		System.out.println("In table Hospitals data is updated Successfully....");
		c.close();
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("delete from hospitals where capacity=?");
		ps.setInt(1, 550);
		ps.executeUpdate();
		System.out.println("In table Hospitals data is deleted Successfully....");
		c.close();
	}
	
	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps= c.prepareStatement("select * from Hospitals");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
		}
		c.close();
		
	}
	


}
