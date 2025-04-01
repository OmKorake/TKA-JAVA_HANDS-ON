package com.stud.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stud.entity.Student;

import jakarta.persistence.criteria.Root;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sf;

	public String insertData(Student s) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(s);
		tr.commit();
		ss.close();
		return "Data is inserted Sucessfully......";
		
	}
	
	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = ss.get(Student.class, id);
		ss.remove(s);
		tr.commit();
		ss.close();
		return "Data is deleted.....";
		
		
	}
	
	public String updateData(Student s,int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student s1 = ss.get(Student.class, id);
		s1.setAge(s.getAge());
		s1.setCity(s.getCity());
		s1.setCourse(s.getCourse());
		s1.setEmail(s.getEmail());
		s1.setGender(s.getGender());
		s1.setName(s.getName());
		ss.merge(s1);
		tr.commit();
		ss.close();
		return "Data is updated.....";
		
	}
	
	public Student getSingleRecord(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student e = ss.get(Student.class, id);

		tr.commit();
		ss.close();

		return e;
	}

	public List<Object> getAllRecord(Student s) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> jcq = hcb.createQuery();
		Root<Student> root = jcq.from(Student.class);

		jcq.select(root);

		Query<Object> query = ss.createQuery(jcq);
		List<Object> list = query.getResultList();
		tr.commit();
		ss.close();

		return list;
	}
}
