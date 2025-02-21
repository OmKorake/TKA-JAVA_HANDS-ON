package com.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students1 {
	
	public void createTable() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.execute("create  table students(id int,name varchar(25), age int, marks int,dob date,address varchar(50))");
		System.out.println("Table Students is created Successfully....");
		c.close();
		
	}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into students(id,name,dob,marks,age,address) values (11,'Sandhya','2004-03-03',86,20,'Barshi'),"
				+ "(12,'Karan     ','2003-08-10',70,21,'Vairag'),"
				+ "(13,'Niket     ','2005-07-08',88,19,'Pune'),"
				+ "(14,'Atharv    ','2004-04-08',87,20,'Solapur'),"
				+ "(15,'Prajwal   ','2006-11-01',84,18,'Dharashiv'),"
				+ "(16,'Samaruddhi','2003-09-10',80,21,'Kolhapur')");
		System.out.println("In table Student data is inserted Successfully....");
		c.close();
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update students set name='Pranav' where id=12");
		s.executeUpdate("update students set address='Mumbai' where name='Prajwal'");
		s.executeUpdate("update students set dob='2002-04-08' where marks=80");
		System.out.println("Table Students data is updated Successfully.....");
		c.close();
		
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from students where id = 16");
		System.out.println("Mentioned data is deleted Successfully...!!!");
		c.close();
		
	}
	
	public void getallData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s =c.createStatement();
		ResultSet rs = s.executeQuery("Select * from students");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getDate(5)+"  "+rs.getString(6));
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		Students1 s = new Students1();
//  	s.createTable();
//		s.insertData();
//		s.updateData();
//  	s.deleteData();
		s.getallData();

	}

}
