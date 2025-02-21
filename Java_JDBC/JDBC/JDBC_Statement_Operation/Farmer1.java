package com.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Farmer1 {
public void createTable() throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
	Statement s= c.createStatement();
	s.executeUpdate("create table farmer(reg_no int,name varchar(40),g_no int,gender varchar(40),age int,village varchar(40),dist varchar(40))");
	System.out.println("Table farmer is created Successfully....");
	c.close();
}
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into farmer (reg_no, name, g_no, gender, age, village, dist) values (654,'Shyamrav',229,'Male',50,'Vairag','Solapur'),"
                +"(765,'Sarita',228,'Female',40,'Kati','Dharashiv'),"
                +"(245,'Naghesh',224,'Male',55,'Dhamangaon','Solapur'),"
                +"(433,'Shantanu',332,'Male',60,'Raleras','Solapur'),"
                +"(234,'Shahubai',223,'Female',45,'Khuntewadi','Dharashiv')");
		System.out.println("Data inserted Successfully....");
		c.close();
		
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update farmer set reg_no=543 where name='Shyamrav'");
		s.executeUpdate("update farmer set village='Dhamangaon' where reg_no=234");
		s.executeUpdate("update farmer set dist='Solapur' where name='Shahubai'");
		System.out.println("Table Farmer data is updated Successfully.....");
		c.close();
		
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from farmer where reg_no = 245");
		System.out.println("Mentioned data is deleted Successfully...!!!");
		c.close();
		
	}
	
	public void getallData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s =c.createStatement();
		ResultSet rs = s.executeQuery("Select * from farmer");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getString(4)+"   "+rs.getInt(5)+"   "+rs.getString(6)+"   "+rs.getString(7));
		}
		
	}


	public static void main(String[] args) throws Exception {
		
		Farmer1 f1 = new Farmer1();
//		f1.createTable();
//		f1.insertData();
//		f1.updateData();
//		f1.deleteData();
		f1.getallData();


	}

}
