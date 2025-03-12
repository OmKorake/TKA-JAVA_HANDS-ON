package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Car;

public class CarDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into cars(cno,color,company,lonch_year,model,price,seat_capy) values(:cno,:color,:company,:lonch_year,:model,:price,:seat_capy)";

		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("cno", "MH12LK2312");
		query.setParameter("color", "Black");
		query.setParameter("company", "Mahindra");
		query.setParameter("lonch_year", "2021");
		query.setParameter("model", "Scrpio N");
		query.setParameter("price", 1600000);
		query.setParameter("seat_capy", 8);

		query.executeUpdate();
		System.out.println("Data is inserted.............");
		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Car set lonch_year=:lonch_year where id=:id";
		Query<Car> query = ss.createQuery(hqlQuery);
		query.setParameter("lonch_year", 2019);
		query.setParameter("id", 3);
		query.executeUpdate();

		System.out.println("Data is updated.......");
		tr.commit();
		ss.close();
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete from Car where id =:id";

		MutationQuery query = ss.createMutationQuery(hqlQuery);
		int id = 2;
		query.setParameter("id", id);
		query.executeUpdate();
		System.out.println("Data is deleted......");
		tr.commit();
		ss.close();

	}
	
	public void getsingleData() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Car where id=:id";
		Query<Car> query = ss.createQuery(hqlQuery);
		int id = 1;
		query.setParameter("id", id);
		Car c = query.getSingleResult();
		System.out.println(c);
		tr.commit();
		ss.close();
	}
	
	public void getAllData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Car";
		Query<Car> query = ss.createQuery(hqlQuery,Car.class);
		List list = query.list();
		
		for (Object object : list) {
			System.out.println(object);
		}
		

	}

}
