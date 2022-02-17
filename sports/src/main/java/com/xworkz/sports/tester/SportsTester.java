package com.xworkz.sports.tester;

import com.xworkz.sports.dao.SportsDAO;
import com.xworkz.sports.dao.SportsDAOImpli;
import com.xworkz.sports.dto.SportsDTO;

public class SportsTester {
	
	public static void main(String[] args) { 
		
		SportsDTO sportsDTO = new SportsDTO();
		sportsDTO.setId(7);
		sportsDTO.setType("cricket");
		sportsDTO.setName("virat");
		sportsDTO.setNoOfPlayers(11);
		sportsDTO.setCountryOfOrigin("INDIA");
		
		SportsDTO sportsDTO2 = new SportsDTO();
		sportsDTO2.setId(34);
		sportsDTO2.setType("football");
		sportsDTO2.setName("messi");
		sportsDTO2.setNoOfPlayers(8);
		sportsDTO2.setCountryOfOrigin("ENGLAND");
		
		SportsDTO sportsDTO3 = new SportsDTO();
		sportsDTO3.setId(123);
		sportsDTO3.setType("Badmiton");
		sportsDTO3.setName("pvsindhu");
		sportsDTO3.setNoOfPlayers(2);
		sportsDTO3.setCountryOfOrigin("INDIA");
		
		SportsDAO sportsDAO = new SportsDAOImpli();
		sportsDAO.saveSports(sportsDTO);
		sportsDAO.saveSports(sportsDTO2);
		sportsDAO.saveSports(sportsDTO3);
		System.out.println(sportsDAO);
		
		SportsDAO sportsDAO2= new SportsDAOImpli();
		sportsDAO2.getSportsById(7);
		System.out.println(sportsDAO2);
		
	}

}
