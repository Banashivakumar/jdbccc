package com.xworkz.socialmedia.tester;

import com.xworkz.socialmedia.dao.SocialMediaDAO;
import com.xworkz.socialmedia.dao.SocialMediaDAOImpl;
import com.xworkz.socialmedia.dto.SocialMediaDTO;

public class AppRunner {
	
	public static void main(String[] args) {
		
		SocialMediaDTO socialMediaDTO = new SocialMediaDTO();
		socialMediaDTO.setId(1);
		socialMediaDTO.setAppName("instagram");
		socialMediaDTO.setRevenue(4.56f);
		socialMediaDTO.setRatings(4.5);
		socialMediaDTO.setVersion(2.53);
		
		SocialMediaDTO socialMediaDTO1 = new SocialMediaDTO();
		socialMediaDTO1.setId(1);
		socialMediaDTO1.setAppName("snapchat");
		socialMediaDTO1.setRevenue(4.23f);
		socialMediaDTO1.setRatings(4.3);
		socialMediaDTO1.setVersion(3.45);
		
		SocialMediaDAO dao = new SocialMediaDAOImpl();
		dao.save(socialMediaDTO);
		
		System.out.println(dao.getByRevenue(4.56f));
		System.out.println(dao.getByAppName("snapchat"));
		
	}

}
