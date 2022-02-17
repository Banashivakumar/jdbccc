package com.xworkz.sports.dao;

import com.xworkz.sports.dto.SportsDTO;

public interface SportsDAO {
	
	public void saveSports(SportsDTO sportsDTO);
	
	public  SportsDTO getSportsById(int sportsId);
		
		
	}


