package com.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee1 {
	
	public void createTable() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("create table employee( id int,e_name varchar(25),prifile varchar(30),email varchar(40),salary int,age int,city varchar(50))");
		System.out.println("Table Employee is created Successfully....");
		c.close();
	}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employee values(111,'Prathamesh','Manager','pratham2004@gmail.con',90000,30,'Barshi'),"
				+ "(112,'Shubham ','Assi.Manager','shubham765@gmail.con',80000,28,'Pune'),"
				+ "(113,'Shantanu','Accounting','shantanu726@gmail.con',70000,33,'Kolhapur'),"
				+ "(114,'Shreeraj','Tester','shree3524@gmail.con',75000,27,'Pune'),"
				+ "(115,'Yogesh','Salse','yogesh35324@gmail.con',50000,25,'Solapur'),"
				+ "(116,'Dhiraj','Tester','dhiraj7653@gmail.com',45000,27,'Dharashiv')");
		System.out.println(" In table Employee data is inserted Successfully....");
		c.close();
		
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update employee set prifile ='Developer' where id=114");
		s.executeUpdate("update employee set city='Mumbai' where id=115");
		System.out.println("Table Employee data is updated Successfully.....");
		c.close();
	}

	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from employee where id = 111");
		System.out.println("Mentioned data is deleted Successfully...!!!");
		c.close();
		
	}
	
	public void getallData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s =c.createStatement();
		ResultSet rs = s.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getInt(5)+"   "+rs.getInt(6)+"  "+rs.getString(7));
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		Employee1 e1= new Employee1();
//    	e1.createTable();
//		e1.insertData();
//		e1.updateData();
//  	e1.deleteData();
    	e1.getallData();

	}

}
