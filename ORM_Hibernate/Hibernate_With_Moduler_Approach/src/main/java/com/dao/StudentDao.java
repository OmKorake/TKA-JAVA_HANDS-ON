package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Student;

import jakarta.persistence.criteria.Root;

public class StudentDao {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setFname("Prajwal");
		s.setLname("Jadhav");
		s.setAge(19);
		s.setCourse("Python");
		s.setCity("Dharashiv");
		s.setPincode(425067);
		s.setState("Maharastra");

		ss.persist(s);

		System.out.println("Data is inserted.......");

		tr.commit();
		ss.close();

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;
		Student s1 = ss.get(Student.class, id);
		s1.setCity("Pune");

		ss.merge(s1);
		System.out.println("Data is updated....");
		tr.commit();
		ss.close();

	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 4;
		Student s2 = ss.get(Student.class, id);
		ss.remove(s2);
		System.out.println("Data is deleted......");
		tr.commit();
		ss.close();
	}

	public void GetPertiData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 3;
		Student s2 = ss.get(Student.class, id);
		System.out.println(s2);
		tr.commit();
		ss.close();

	}

	public void GetAllData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cg = hcb.createQuery();
		Root<Student> root = cg.from(Student.class);
		cg.select(root);
		org.hibernate.query.Query<Object> query = ss.createQuery(cg);
		List<Object> list = query.getResultList();
		for (Object std : list) {
			System.out.println(std);
		}
		tr.commit();
		ss.close();
	}
}