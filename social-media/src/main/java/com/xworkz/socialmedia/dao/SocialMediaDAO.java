package com.xworkz.socialmedia.dao;

import com.xworkz.socialmedia.dto.SocialMediaDTO;

public interface SocialMediaDAO {
	
	void save(SocialMediaDTO dto);
	public SocialMediaDTO getByRevenue(float revenue);
	public SocialMediaDTO getByAppName(String name);

}
