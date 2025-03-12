package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Teacher;

public class TeacherDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into teacher(fname,lname,email,gender,subject,salary,city,pincode,state) values(:fname,:lname,:email,:gender,:subject,:salary,:city,:pincode,:state)";

		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("fname", "Ashwini");
		query.setParameter("lname", "Mane");
		query.setParameter("email", "mane765@gmail.com");
		query.setParameter("gender", "Femail");
		query.setParameter("subject", "SEN");
		query.setParameter("salary", 130000);
		query.setParameter("city", "Vardha");
		query.setParameter("pincode", 415239);
		query.setParameter("state", "Maharashtra");
		query.executeUpdate();

		System.out.println("Data is inserted.........");
		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Teacher set salary=:salary where id=:id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("salary", 178000);
		query.setParameter("id", 1);
		query.executeUpdate();
		System.out.println("Data is updated........");
		tr.commit();
		ss.close();

	}

	public void getsingleData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Teacher where id=:id";
		Query<Teacher> query = ss.createQuery(hqlQuery);
		int id = 1;
		query.setParameter("id", id);
		Teacher t = query.getSingleResult();
		System.out.println(t);
		tr.commit();
		ss.close();

	}

	public void getallData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Teacher";
		Query<Teacher> query = ss.createQuery(hqlQuery,Teacher.class);
		List list = query.list();
		for (Object object : list) {
			System.out.println(object);
			
		}
		
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "delete from Teacher where id=:id";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		int id = 4;
		query.setParameter("id", id);
		query.executeUpdate();
		System.out.println("Data is deleted......");
		tr.commit();
		ss.close();
		

	}

}
