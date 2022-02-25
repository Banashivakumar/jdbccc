package com.xworkz.socialmedia.dao;

import java.util.List;

import com.xworkz.socialmedia.dto.SocialMediaDTO;

public interface SocialMediaDAO {
	
	void save(SocialMediaDTO dto);
	public SocialMediaDTO getByRevenue(float revenue);
	public SocialMediaDTO getByAppName(String name);
    public SocialMediaDTO getByRatings(double ratings);
    public List<SocialMediaDTO> getAll();
 
}
