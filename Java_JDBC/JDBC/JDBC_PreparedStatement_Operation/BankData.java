package com.prepstetment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankData {
	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into bank(b_id , b_name , branch_name ,contect_no) values(?,?,?,?)");
		ps.setInt(1, 1021);
		ps.setString(2, "Bank of Maharashtra");
		ps.setString(3, "Solapur");
		ps.setLong(4, 162);

		ps.setInt(1, 2054);
		ps.setString(2, "Bank of India");
		ps.setString(3, "Kolhapur");
		ps.setLong(4, 322);

		ps.setInt(1, 3077);
		ps.setString(2, "Bank of Badoda ");
		ps.setString(3, "Sangali");
		ps.setLong(4, 211);

		ps.setInt(1, 4066);
		ps.setString(2, "ICIC");
		ps.setString(3, "Mumbai");
		ps.setLong(4, 144);

		ps.setInt(1, 5022);
		ps.setString(2, "HDFC");
		ps.setString(3, "Pune");
		ps.setLong(4, 177);

		ps.executeUpdate();
		System.out.println("Data is inserted Successfully...");

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("update bank set b_id=? where b_name=?");
		ps.setInt(1, 7033);
		ps.setString(2, "ICIC");
		ps.executeUpdate();
		System.out.println("Data is updated Successfully....");
		c.close();

	}

	public void deletData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from bank where b_id=?");
		ps.setInt(1, 3077);
		ps.executeUpdate();
		System.out.println("Data is deleted Successfully....");
		c.close();
	}

	public void getallData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from bank");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
		}
		c.close();

	}

}
