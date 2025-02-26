package com.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo12")
public class EmployeeRegister extends HttpServlet{
	
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
			int check = ps.executeUpdate();
			
			
			if(check > 0) {
			PrintWriter out = resp.getWriter();
			out.println("<html><body>");
			out.println("<div style='text-align:center; margin-top:20px; font-size:20px; font-weight:bold; color:green; padding:10px; border:2px solid green; display:inline-block; background-color:#DFF2BF;'>");
			out.println("✔ Register Successfully!");
			out.println("</div>");
			out.println("</body></html>");
		}
			else {
				PrintWriter out = resp.getWriter();
				out.print("Fail  to register!please try again.....!!");
			}
			resp.setContentType("text/html");
			RequestDispatcher rd = req.getRequestDispatcher("/emphome.html");
			rd.include(req,resp);
			
			c.close();
			
	
		} catch (Exception e) {
			
		}
		
		
	}
	

}
