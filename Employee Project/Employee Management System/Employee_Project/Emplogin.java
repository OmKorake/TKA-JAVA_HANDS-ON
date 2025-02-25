package com.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Emplogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1205","root","root");
			PreparedStatement ps = c.prepareStatement("select * from employee where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ps.executeQuery();
			
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('Login Successfully')</script>");
			c.close();
			
		} catch (Exception e) {
			System.out.println("wrong get out");
			
		}
		
		
	}

}
