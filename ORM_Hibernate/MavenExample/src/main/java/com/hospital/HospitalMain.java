package com.hospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HospitalMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Hospital h = new Hospital();
		h.setId(11);
		h.setName("OSAM Hospital");
		h.setCon_no(421);
		h.setEmail("osam1205@gmail.com");
		h.setCount_doctors(100);
		h.setCount_nurses(150);
		h.setCount_beds(500);
		h.setAddress("A41,OSAM Town-line,Krushnanagar,Chikhali");
		h.setCity("Pune");
		h.setPincode(412003);
		h.setState("Maharashtra");
		h.setCountry("India");
		
		ss.persist(h);
		System.out.println("Data is inserted.....");
		tr.commit();
		ss.close();

	}

}
