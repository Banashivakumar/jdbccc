package com.xworkz.sports.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sports.dto.SportsDTO;

public class SportsDAOImpli implements SportsDAO {

	@Override
	public void saveSports(SportsDTO sportsDTO) {
		Configuration cfg = new Configuration();
		 cfg.configure();
	 SessionFactory sessionFactory = cfg.buildSessionFactory();
	 Session session = sessionFactory.openSession();
	 Transaction transaction = session.beginTransaction();
		
	 session.save(sportsDTO);
	 transaction.commit();
	 
	 session.close();
	 System.out.println("sports addedd------");
		
	}

	@Override
	public SportsDTO getSportsById(int sportsId) {
		Session session = null;
		SportsDTO sportsDTO = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
			sportsDTO = session.get(SportsDTO.class, sportsId);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session != null)
				session.close();		
		}
			
		return sportsDTO;
	}

}
