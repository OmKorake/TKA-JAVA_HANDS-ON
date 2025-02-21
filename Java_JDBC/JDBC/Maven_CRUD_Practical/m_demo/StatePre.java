package com.m_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatePre {
	
	public void createTable() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("create table state(id int primary key auto_increment,s_name varchar(40) not null,abbreviation varchar(10),capital varchar(40),language varchar(50),established_year int,region varchar(40),country varchar(40) default'India')");
		ps.execute();
		System.out.println("Table State is created Successfully.....");
		c.close();

	}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("insert into state(s_name,abbreviation,capital,language,established_year,region)values(?,?,?,?,?,?)");
		ps.setString(1, "Maharashtra");
		ps.setString(2, "MH");
		ps.setString(3, "Mumbai");
		ps.setString(4, "Marathi");
		ps.setInt(5, 1960);
		ps.setString(6, "West");
		
		ps.setString(1, "MadhyaPradesh");
		ps.setString(2, "MP");
		ps.setString(3, "Bhopal");
		ps.setString(4, "Hindi");
		ps.setInt(5, 1956);
		ps.setString(6, "Central");		
		
		ps.setString(1, "West Bengal");
		ps.setString(2, "WB");
		ps.setString(3, "Kolkata");
		ps.setString(4, "Bengali");
		ps.setInt(5, 1950);
		ps.setString(6, "East");	
		
		ps.setString(1, "Tamil Nadu");
		ps.setString(2, "TN");
		ps.setString(3, "Chennai");
		ps.setString(4, "Tamil");
		ps.setInt(5, 1950);
		ps.setString(6, "South");	
		
		ps.setString(1, "AndhraPradesh");
		ps.setString(2, "AP");
		ps.setString(3, "Amaravati");
		ps.setString(4, "Telauu");
		ps.setInt(5, 2014);
		ps.setString(6, "South");	
		
		ps.setString(1, "Karnataka");
		ps.setString(2, "KA");
		ps.setString(3, "Bengaluru");
		ps.setString(4, "Kannada");
		ps.setInt(5, 1956);
		ps.setString(6, "South");
		
		ps.setString(1, "Gujarat");
		ps.setString(2, "GJ");
		ps.setString(3, "Gandhinagar");
		ps.setString(4, "Ahmedabad");
		ps.setInt(5, 1960);
		ps.setString(6, "West");
		
		ps.executeUpdate();
		System.out.println("In table State data is inserted Successfully.....");
		c.close();
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("update state set capital=? where s_name=?");
		ps.setString(1,"Gujarat");
		ps.setString(2, "Gandhinagar");
		ps.executeUpdate();
		System.out.println("In table State data is updated Successfully....");
		c.close();
		
	}

	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("delete from state where abbreviation=?");
		ps.setString(1,"WB");
		ps.executeUpdate();
		System.out.println("fom Table State data is deleted Successfully....");
		c.close();

		
	}

	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("select * from state");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getString(5)+"   "+rs.getInt(6)+"   "+rs.getString(7)+"   "+rs.getString(8));
		}
		c.close();
		
	}

}
