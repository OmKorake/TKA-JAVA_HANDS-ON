package com.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
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
		
		resp.setContentType("text/html");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1205","root","root");
			PreparedStatement ps = c.prepareStatement("select * from employee where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				req.setAttribute("fname", rs.getString("fname"));
				req.setAttribute("lname", rs.getString("lname"));
				req.setAttribute("gender", rs.getString("gender"));
				req.setAttribute("dob", rs.getString("dob"));
				req.setAttribute("connum", rs.getString("connum"));
				req.setAttribute("email", rs.getString("email"));
				req.setAttribute("city", rs.getString("city"));
				req.setAttribute("state", rs.getString("state"));
				req.setAttribute("sal", rs.getString("sal"));
				req.setAttribute("joindate", rs.getString("joindate"));
				req.setAttribute("role", rs.getString("role"));
				req.setAttribute("typeofwork", rs.getString("typeofwork"));
				PrintWriter out = resp.getWriter();
				out.println("<html><body>");
				out.println("<div style='position: absolute; top: 10px; left: 50%; transform: translateX(-50%); font-size: 20px; font-weight: bold; color: green; padding: 10px; border: 2px solid green; display: inline-block; background-color: #DFF2BF;'>");
				out.println("✔ Login Successfully...");
				out.println("</div>");
				out.println("</body></html>");

				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
						
				
			}
			else {
				PrintWriter out = resp.getWriter();
				out.println("<html><body>");
				out.println("<div style='text-align:center; margin:0px; font-size:20px; font-weight:bold; color:red; padding:10px; border:2px solid red; display:inline-block; background-color:#DFF2BF;'>");
				out.println("❌Invalid User!please try again.....!!");
				out.println("</div>");
				out.println("</body></html>");				
				RequestDispatcher rd = req.getRequestDispatcher("/emphome.html");
				rd.include(req,resp);

			}
			c.close();
			
		} catch (Exception e) {
			System.out.println("wrong get out");
			
		}
		
		
	}

}
