package com.xworkz.movies.dao;

import java.util.List;

import com.xworkz.movies.dto.MoviesDTO;

public interface MoviesDAO {
	
	
	public List<MoviesDTO> mapMovieDetails(List<MoviesDTO> list);
	public void saveMovieDetails(List<MoviesDTO> list);

}
