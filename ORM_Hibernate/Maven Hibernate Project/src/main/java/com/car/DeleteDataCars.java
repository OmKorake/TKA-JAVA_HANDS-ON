package com.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hospital.Hospital;

public class DeleteDataCars {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Cars.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id = 2;
		Cars h = ss.get(Cars.class, id);
		
		ss.remove(h);
		System.out.println("Data is deleted....");
		tr.commit();
		ss.close();
	}

}
