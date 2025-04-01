package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Vehicle;

@Repository
public class VehicleDao {

	@Autowired
	SessionFactory sf;

	
	public String insertData(Vehicle v) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(v);
		tr.commit();
		ss.close();
		return "Vehicle details is inserted sucessfully......";

	}
	
	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Vehicle v = ss.get(Vehicle.class, id);
		ss.remove(v);
		tr.commit();
		ss.close();
		return "Data is deleted......";

	}
	
	public String updateData(Vehicle v, int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Vehicle v1 = ss.get(Vehicle.class, id);
		v1.setColor(v.getColor());
		v1.setCompany(v.getCompany());
		v1.setFueltype(v.getFueltype());
		v1.setModel(v.getModel());
		v1.setPrice(v.getPrice());
		v1.setYear(v.getYear());
		ss.merge(v1);
		tr.commit();
		ss.close();
		return "Data is updated......";
		
	}
	
	
	
	
	
	
	
	
	
	
//	public List<Student> getAllData() {
//        Session ss = factory.openSession();
//        List<Student> students = ss.createQuery("from Student", Student.class).list();
//        ss.close();
//        return students;
//    }
	

}
