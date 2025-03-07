package com.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarsMain {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Cars.class);
		
		SessionFactory sf =  cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Cars c = new Cars();
		c.setId(2);
		c.setCno("MH12TS2342");
		c.setCompany("Tata");
		c.setModel("Punch");
		c.setColor("Black");
		c.setPrice(210000);
		c.setLonch_year(2023);
		c.setSeat_capy(4);
		
		ss.persist(c);
		System.out.println("Data is inserted....");
		
		tr.commit();
		ss.close();
	} 

}
