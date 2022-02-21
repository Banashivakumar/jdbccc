package com.xworkz.movies.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.movies.dao.MoviesDAOImpli;
import com.xworkz.movies.dto.MoviesDTO;

public class MoviesTester {

	public static void main(String[] args) {

		List<MoviesDTO> dto = new ArrayList<>(); 
		MoviesDAOImpli daoImpl = new MoviesDAOImpli();

		daoImpl.mapMovieDetails(dto);
		
		daoImpl.saveMovieDetails(dto);

	}
	
	
}
