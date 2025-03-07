package com.hospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletedataHos {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id = 12;
		Hospital h = ss.get(Hospital.class, id);
		
		ss.remove(h);
		System.out.println("Data is deleted....");
		tr.commit();
		ss.close();
	}

}
