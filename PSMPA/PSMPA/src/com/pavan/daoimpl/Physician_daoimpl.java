package com.pavan.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pavan.dao.Physician_dao;
import com.pavan.model.Patient;


@Component
public class Physician_daoimpl implements Physician_dao{

	
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	
	@Override
	public void addPhysician(Patient patient) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Query query;

		query = session.createQuery("from MediaItem");
		List list = query.list();

		session.close();
	}

	@Override
	public Patient getPhysicianDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
