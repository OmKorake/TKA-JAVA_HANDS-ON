package com.mainclass;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Department;
import com.entities.Employee1;

public class DeptEmpMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee1.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDid(432213);
		d.setDname("Account");
		d.setHead("Karan Deshamukh");
		
		ss.persist(d);
		

		Employee1 e = new Employee1();
		e.setEmpid(2221);
		e.setEname("Pranav");
		e.setEmail("pranav46@gmail.com");
		e.setDept(d);
		ss.persist(e);

		Employee1 e1 = new Employee1();
		e1.setEmpid(2222);
		e1.setEname("Atharv");
		e1.setEmail("atharv08@gmail.com");
		e1.setDept(d);
		ss.persist(e1);

		Employee1 e2 = new Employee1();
		e2.setEmpid(2223);
		e2.setEname("Mauli");
		e2.setEmail("mauli60@gmail.com");
		e2.setDept(d);
		ss.persist(e2);

		Employee1 e3 = new Employee1();
		e3.setEmpid(2224);
		e3.setEname("Amit");
		e3.setEmail("amit35@gmail.com");
		e3.setDept(d);
		ss.persist(e3);

		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
 
		d.setEpm(list);
		

		System.out.println("Data is inserted.....");
		tr.commit();
		ss.close();

	}

}
