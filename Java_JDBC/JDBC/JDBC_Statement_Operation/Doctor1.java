package com.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Doctor1 {
public void createTable() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("create  table doctor(d_id int ,d_name varchar(25) ,d_age int , d_mail varchar(30) , d_mono bigint , d_city varchar(30))");
		System.out.println("Table Doctor is created Successfully....");
		c.close();
	}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into doctor(d_id,d_name,d_age,d_mail,d_mono,d_city) values(101,'A K Patil',45,'apatil234@gmail.com',8978673452,'Pune'),"
				+ "(102,'D T Rane',44,'adrane34@gmail.com',9978653412,'Solapur'),"
				+ "(103,'M D Salavi',60,'msalavi33@gmail.com',9988778833,'Mumbai'),"
				+ "(104,'N M Kale',54,'nkale65@gmail.com',7676232345,'Dharashiv'),"
				+ "(105,'L A Pandhare',61,'lpandhare24@gmail.com',7897897654,'Barshi')");
		System.out.println("Data inserted Successfully....");
		c.close();
		
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update doctor set d_name ='A K Mane' where d_id=102");
		s.executeUpdate("update doctor set d_city='Mumbai' where d_id=101");
		System.out.println("Table Doctor data is updated Successfully.....");
		c.close();
	}

	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from doctor where d_id = 105");
		System.out.println("Mentioned data is deleted Successfully...!!!");
		c.close();
		
	}
	
	public void getallData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s =c.createStatement();
		ResultSet rs = s.executeQuery("Select * from doctor");
		while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + "   " + rs.getInt(3) + "   " + rs.getString(4) + "   " + rs.getLong(5) + "   " + rs.getString(6));
		}
		
	}

	public static void main(String[] args) throws Exception {

		Doctor1 d1= new Doctor1();
//		d1.createTable();
//		d1.insertData();
//		d1.updateData();
//		d1.deleteData();
		d1.getallData();
	
	}

}
