package com.xworkz.socialmedia.tester;

import java.util.List;

import com.xworkz.socialmedia.dao.SocialMediaDAO;
import com.xworkz.socialmedia.dao.SocialMediaDAOImpl;
import com.xworkz.socialmedia.dto.SocialMediaDTO;

public class AppRunner {
	
	public static void main(String[] args) {
		
		SocialMediaDTO socialMediaDTO = new SocialMediaDTO();
		socialMediaDTO.setId(2);
		socialMediaDTO.setAppName("instagram");
		socialMediaDTO.setRevenue(4.56f);
		socialMediaDTO.setRatings(4.5);
		socialMediaDTO.setVersion(2.53);
		
		SocialMediaDTO socialMediaDTO1 = new SocialMediaDTO();
		socialMediaDTO1.setId(3);
		socialMediaDTO1.setAppName("snapchat");
		socialMediaDTO1.setRevenue(4.23f);
		socialMediaDTO1.setRatings(4.3);
		socialMediaDTO1.setVersion(3.45);
		
		SocialMediaDAO dao = new SocialMediaDAOImpl();
		//dao.save(socialMediaDTO);
		//dao.save(socialMediaDTO1);
		
		//System.out.println(dao.getByRevenue(4.56f));
		//System.out.println(dao.getByAppName("snapchat"));
		
		//SocialMediaDTO dtoByRate = dao.getByRatings(4.5);
		//System.out.println(dtoByRate.getRatings());
		
		List<SocialMediaDTO> getall = dao.getAll();
		for(SocialMediaDTO socialMedia : getall) {
			System.out.println(socialMedia.getId());
			System.out.println(socialMedia.getAppName());
			System.out.println(socialMedia.getRevenue());
		    System.out.println(socialMedia.getRatings());
	        System.out.println(socialMedia.getVersion());
			
			
			
		}
		
	}

}
