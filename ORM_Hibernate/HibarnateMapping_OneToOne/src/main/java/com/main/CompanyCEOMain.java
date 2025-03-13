package com.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.CEO;
import com.entities.Company;

public class CompanyCEOMain {
	public static void main(String[] args) {
		 
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Company.class);
		cfg.addAnnotatedClass(CEO.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
	   CEO c = new CEO();
	   c.setCeo_id(501);
	   c.setCeo_name("Prajwal");
	   
	   ss.persist(c);
	   
	   Company co = new Company();
	   co.setId(2234);
	   co.setCompany_name("OSAM Tech");
	   co.setCeo(c);
	   
	   ss.persist(co);
	   
	   tr.commit();
	   ss.close();
		
		
	}

}
