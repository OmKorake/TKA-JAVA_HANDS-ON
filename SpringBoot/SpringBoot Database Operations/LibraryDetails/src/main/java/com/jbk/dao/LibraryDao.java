package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Library;

@Repository
public class LibraryDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Library l) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(l);
		tr.commit();
		ss.close();
		return "In Library details is inserted sucessfully......";

	}

	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Library l = ss.get(Library.class, id);
		ss.remove(l);
		tr.commit();
		ss.close();
		return "Data is deleted.......";

	}
	
	public String updateData(Library l , int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Library l1 = ss.get(Library.class, id);
		l1.setAddress(l.getAddress());
		l1.setEmail(l.getEmail());
		l1.setFees(l.getFees());
		l1.setLibrarianName(l.getLibrarianName());
		l1.setName(l.getName());
		l1.setOpeninghours(l.getOpeninghours());
		l1.setTotalBooks(l.getTotalBooks());
		l1.setWebsite(l.getWebsite());
		ss.merge(l1);
		tr.commit();
		ss.close();
		return "Data is updated.....";
		
		
	}

}
