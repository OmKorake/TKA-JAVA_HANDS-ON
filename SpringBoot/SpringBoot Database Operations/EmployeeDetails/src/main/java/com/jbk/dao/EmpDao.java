package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository
public class EmpDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Employee e) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(e);
		tr.commit();
		ss.close();
		return "Employee details is inserted sucessfully..........";

	}
	
	public String deleteData(int id) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e = ss.get(Employee.class, id);
		ss.remove(e);
		tr.commit();
		ss.close();
		return "Data is deleted.....";
	}
	
	public String updateData(Employee e,int id) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e1 = ss.get(Employee.class, id);
		e1.setName(e.getName());
		e1.setEmail(e.getEmail());
		e1.setAge(e.getAge());
		e1.setCity(e.getCity());
		e1.setRole(e.getRole());
		e1.setSal(e.getSal());
		ss.merge(e1);
		tr.commit();
		ss.close();
		return "Data is updated.....";
		
		
	}

}
