package com.test.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.test.entity.CreaditCard;

@Repository
public class CcardDao {
	
	@Autowired
	SessionFactory sf;
	
	public String insertData(CreaditCard c) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(c);
		tr.commit();
		ss.close();
		return "Data is inserted Sucessfully......";
		
	}
	
	
	public List<CreaditCard> getAlldata(CreaditCard c) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from CreaditCard";
		Query<CreaditCard> query = ss.createQuery(hqlQuery, CreaditCard.class);
		List<CreaditCard> list = query.list();
		tr.commit();
		ss.close();
		return list;

	}
	public CreaditCard getpertiData(Date expirydata) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from CreaditCard where expirydata=:expirydata";
		Query<CreaditCard> query = ss.createQuery(hqlQuery, CreaditCard.class);
		query.setParameter("expirydata", expirydata);
		CreaditCard c1 = query.getSingleResult();
		tr.commit();
		ss.close();
		return c1;

	}
	
	

}
