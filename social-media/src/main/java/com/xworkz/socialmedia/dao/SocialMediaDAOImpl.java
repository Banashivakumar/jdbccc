package com.xworkz.socialmedia.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.socialmedia.dto.SocialMediaDTO;
import com.xworkz.socialmedia.util.HibernateUtil;

public class SocialMediaDAOImpl implements SocialMediaDAO {
	
	private SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
	@Override
	public void save(SocialMediaDTO dto) {
		Session session = null;
		Transaction tx =null;
		try {
			session = sessionfactory.openSession();
			 tx = session.beginTransaction();
			session.save(dto);
			if(tx!=null)
				tx.commit();
			System.out.println("save success");
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			if(session!=null)
				session.close();
		}
				
		
	}

	@Override
	public SocialMediaDTO getByRevenue(float revenue) {
		
		Session session = null;
		SocialMediaDTO dto = null;
		try {
			session = sessionfactory.openSession();
			Query query = session.createNamedQuery("fetchByRevenue");
			dto = (SocialMediaDTO) query.uniqueResult();
			System.out.println(dto.getAppName());
		} catch (HibernateException e) {
			e.printStackTrace(); 
		}
		
		return dto;
	}

	@Override
	public SocialMediaDTO getByAppName(String name) {
		Session session = null;
		SocialMediaDTO dto = null;

		try {
			String hql ="select social from SocialMediaDTO social where social.appName= '"+name+"' ";

		session = sessionfactory.openSession();
		Query query = session.createQuery(hql);
		
		 dto = (SocialMediaDTO) query.uniqueResult();
		 System.out.println(dto.getAppName());

		 System.out.println("Fetched successfully");


		}
		
		catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		return dto;
		}

	@Override
	public SocialMediaDTO getByRatings(double ratings) {
		
		try(Session sesion = sessionfactory.openSession();){
				Query<SocialMediaDTO> query = sesion.createNamedQuery("fetchByRatings");
				return query.uniqueResult();
		}catch(HibernateException e){
			e.printStackTrace();
		}
				 
		
		return null;
	}

	@Override
	public List<SocialMediaDTO> getAll() {
		String hql = "select social from SocialMediaDTO social";
		List<SocialMediaDTO> dtos = null;
		try(Session session = sessionfactory.openSession();){
			Query<SocialMediaDTO> query = session.createQuery(hql);
			dtos = query.list();
		}catch(HibernateException e) {
		e.printStackTrace();	
		}
		return dtos;
	}

		
	}


