package com.xworkz.airlines.tester;

import com.xworkz.airlines.dao.AirlinesDAO;
import com.xworkz.airlines.dao.AirlinesDAOImpli;
import com.xworkz.airlines.dto.AirlinesDTO;

public class TesterAirlines {

	public static void main(String[] args) {
		
		AirlinesDTO airlinesDTO = new AirlinesDTO();
		airlinesDTO.setAirlinesid(1);
		airlinesDTO.setAirlinesName("indigo");
		airlinesDTO.setPassengerName("bana");
		airlinesDTO.setTicket(986666.55f);
		
		AirlinesDAO dao = new AirlinesDAOImpli();
		dao.save(airlinesDTO);

	}

}
