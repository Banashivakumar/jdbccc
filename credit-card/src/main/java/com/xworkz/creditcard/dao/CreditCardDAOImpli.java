package com.xworkz.creditcard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.creditcard.dto.CreditCardDTO;

public class CreditCardDAOImpli implements CreditCardDAO {

	@Override
	public void saveCard(CreditCardDTO cardDTO) {
		
		//step 1
	 Configuration cfg = new Configuration();
	 cfg.configure();
	 
	 //step 2
	 SessionFactory sessionFactory = cfg.buildSessionFactory();
	 
	 //step 3
	 Session session = sessionFactory.openSession();
	 
	 //step 4
		Transaction transaction = session.beginTransaction();
		
		//step 5
		session.save(cardDTO);
		transaction.commit();
		
		//step 6
		session.close();
		System.out.println("card adeded-------");
	}

}
