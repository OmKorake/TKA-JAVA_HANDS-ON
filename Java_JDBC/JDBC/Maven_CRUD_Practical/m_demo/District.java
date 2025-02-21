package com.m_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class District {

	public void createTable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("create table district(id int primary key auto_increment,name varchar(40),population int,famous_for varchar(50),literacy_rate float,established_year int,state varchar(40) default'Maharashtra')");
		System.out.println("Table District is created Successfully.....");
		c.close();
	}

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into district(name,population,famous_for,literacy_rate,established_year) values('Solapur  ',4317756,' Textile Industry, Siddheshwar Temple',77.02,1838),"
						+ "('Kolhapur ',3874015,' Kolhapuri Chappal, Mahalaxmi Temple ',81.51,1700),"
						+ "('Dharashiv',1658575,' Historical Caves, Forts     ',76.5,1650),"
						+ "('Mumbai   ',12691836,'Bollywood, Financial Capital ',89.73,1500),"
						+ "('Nagpur   ',4653171,' Orange City, Deekshabhoomi',88.39,1702),"
						+ "('Nashik   ',6107187,' Kumbh Mela, Panchawati',82.31,1818),"
						+ "('Pune     ',9429408,' Education ',89.56,1626)");
		System.out.println("In table District data is inserted Successfully....");
		c.close();

	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update district set famous_for='IT Hub' where name='Pune     '");
		System.out.println("In table District data is updated Successfully....");
		c.close();
		
	}
	
	public void deleteData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from district where name='Nashik   '");
		System.out.println("From table District data is deleted Successfully....");
		c.close();
	
	}
	
	public void getallData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from district");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getFloat(5)+" "+rs.getInt(6)+" "+rs.getString(7));
		}
		c.close();
	}

}
