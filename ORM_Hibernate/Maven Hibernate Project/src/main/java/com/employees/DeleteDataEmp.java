package com.employees;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDataEmp {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employees.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id =2;
		Employees e1 = ss.get(Employees.class ,id);
		
//		ss.delete(e1);
		ss.remove(e1);
		
		System.out.println("Data is delete....");
		tr.commit();
		ss.close();

	}

}
