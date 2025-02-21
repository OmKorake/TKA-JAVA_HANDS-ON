package com.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo")
public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname =req.getParameter("lname");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String connum = req.getParameter("cnumber");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String sal = req.getParameter("sal");
		String joindate = req.getParameter("jdate");
		String role = req.getParameter("role");
		String typeofwork = req.getParameter("wtype");
		String pass = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1205","root","root");
			PreparedStatement ps = c.prepareStatement("insert into employee(fname,lname,gender,dob,connum,email,city,state,sal,joindate,role,typeofwork,pass) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, gender);
			ps.setString(4, dob);
			ps.setString(5, connum);
			ps.setString(6, email);
			ps.setString(7, city);
			ps.setString(8, state);
			ps.setString(9, sal);
			ps.setString(10, joindate);
			ps.setString(11, role);
			ps.setString(12, typeofwork);
			ps.setString(13, pass);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			System.out.println("Data is inserted Successfully.....");
			out.print("<div style='background-color:#28a745; color:white; padding:15px; text-align:center; margin:50px auto; width:60%; border-radius:8px; font-size:22px; font-weight:bold; box-shadow: 4px 4px 24px rgba(1, 1, 1, 1.2); animation: fadeIn 1.5s ease-in-out;>  Data has been inserted successfully....</div>");
			out.print("<style>@keyframes fadeIn { from { opacity: 0; transform: scale(0.9); } to { opacity: 1; transform: scale(1); } }</style>");
			c.close();
	
		} catch (Exception e) {
			
		}
	}
	

}
