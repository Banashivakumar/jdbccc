package com.xworkz.airlines.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.util.HibernateUtil;

public class AirlinesDAOImpli implements AirlinesDAO {

	@Override
	public void save(AirlinesDTO dto) {
		
		EntityManagerFactory factory = HibernateUtil.getSessionFactory();

		EntityManager entityManager = factory.createEntityManager();

			entityManager.getTransaction().begin();

			entityManager.persist(dto);

			entityManager.getTransaction().commit();

			entityManager.close();

	}
		
		
	}
	
	
