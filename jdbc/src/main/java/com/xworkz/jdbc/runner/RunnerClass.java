package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dao.CricketDAO;
import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class RunnerClass {

	public static void main(String[] args) {
		CricketDetailsDTO cricketDetailsDTO=new CricketDetailsDTO();
		cricketDetailsDTO.setNoofPlayers((byte)15);
		cricketDetailsDTO.setTeamName("RCB");
		cricketDetailsDTO.setCaptainName("virat");
		cricketDetailsDTO.setMatchesPlayed(345);
		
     CricketDAO cricketDAO = new CricketDAO();
     cricketDAO.saveCricketDetails(cricketDetailsDTO);
     System.out.println(cricketDetailsDTO);
	}

}
