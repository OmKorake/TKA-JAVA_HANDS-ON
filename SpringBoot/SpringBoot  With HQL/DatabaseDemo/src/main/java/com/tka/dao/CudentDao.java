package com.tka.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
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

		String hqlQuery = "insert into Cudent(name,city) values(:name,:city)";

		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", c.getName());
		query.setParameter("city", c.getCity());
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data is inserted....";
	}

	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Cudent c = ss.get(Cudent.class, id);
		String hqlQuery = "delete from Cudent where id =:id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data is deleted....";

	}

	public String updataData(Cudent c, int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Cudent c1 = ss.get(Cudent.class, id);
		String hqlQuery = "update Cudent set name=:name,city=:city where id=:id";
		MutationQuery query = ss.createQuery(hqlQuery);
		query.setParameter("name", c.getName());
		query.setParameter("city", c.getCity());
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data is updated....";
	}

	public Cudent getSingleData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Cudent where id=:id";
		Query<Cudent> query = ss.createQuery(hqlQuery, Cudent.class);
		query.setParameter("id", id);
		Cudent c1 = query.getSingleResult();
		tr.commit();
		ss.close();
		return c1;

	}

	public List<Cudent> getAlldata(Cudent c) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Cudent";
		Query<Cudent> query = ss.createQuery(hqlQuery, Cudent.class);
		List<Cudent> list = query.list();
		tr.commit();
		ss.close();
		return list;

	}

}
