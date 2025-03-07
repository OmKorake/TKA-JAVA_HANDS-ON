package com.employees;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employees.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		Employees e1 = new Employees();
		e1.setId(2);
		e1.setName("Prajwal");
		e1.setGender("Male");
		e1.setEmail("prajwal54@gmail.com");
		e1.setRole("Tester");
		e1.setSal(50000);
		e1.setCity("Dharashiv");
		e1.setState("Maharastra");
		
		ss.persist(e1);  //use to insert query
		System.out.println("Data is inserted....");
		
		tr.commit();
		ss.close();
		
		
	}

}
