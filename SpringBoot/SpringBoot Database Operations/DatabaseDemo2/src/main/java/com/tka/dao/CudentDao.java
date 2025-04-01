package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Cudent;

@Repository
public class CudentDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Cudent c) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(c);
		tr.commit();
		ss.close();
		return "Data is inserted....";

	}

	public String deleteData(int id) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Cudent c = ss.get(Cudent.class, id);
		ss.remove(c);
		tr.commit();
		ss.close();
		return "Data is deleted....";

	}
	
	public String updataData(Cudent c,int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Cudent c1 = ss.get(Cudent.class, id);
		c1.setName(c.getName());
		c1.setCity(c.getCity());
		ss.merge(c1);
		tr.commit();
		ss.close();
		return "Data is updated......";
	}
	
	public void getAlldata() {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
	}

}
