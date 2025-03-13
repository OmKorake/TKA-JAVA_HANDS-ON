package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Laptop;
import com.entities.Students;

public class SLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLid(2200);
		l.setName("HP");
		
		ss.persist(l);
		
		Students s = new Students();
		s.setName("Prajwal");
		s.setLap(l);
		
		ss.persist(s);
		
		tr.commit();
		ss.close();
		
	}

}
