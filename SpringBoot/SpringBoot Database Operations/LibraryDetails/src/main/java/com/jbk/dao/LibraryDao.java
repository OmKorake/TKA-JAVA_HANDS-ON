package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Library;

import jakarta.persistence.criteria.Root;

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

	public String updateData(Library l, int id) {
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

	public Library getSingleData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Library where id=:id";
		Query<Library> query = ss.createQuery(hqlQuery, Library.class);
		query.setParameter("id", id);
		Library l1 = query.getSingleResult();
		tr.commit();
		ss.close();
		return l1;

	}

	public List<Library> getAlldata(Library l) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Employee";
		Query<Library> query = ss.createQuery(hqlQuery, Library.class);
		List<Library> list = query.list();
		tr.commit();
		ss.close();
		return list;

	}

	public Library getSingleRecord(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Library l = ss.get(Library.class, id);
		tr.commit();
		ss.close();
		return l;
	}

	public List<Object> getAllRecord(Library l) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> jcq = hcb.createQuery();
		Root<Library> root = jcq.from(Library.class);
		jcq.select(root);
		Query<Object> query = ss.createQuery(jcq);
		List<Object> list = query.getResultList();
		tr.commit();
		ss.close();
		return list;
	}

}
