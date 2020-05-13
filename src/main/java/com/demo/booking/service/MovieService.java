package com.demo.booking.service;

import java.util.List;
import com.demo.booking.dto.MovieDTO;

public interface MovieService {

	List<MovieDTO> viewAllMovies();
	boolean addMovie(MovieDTO Movie);
	String editMovie(MovieDTO Movie);
	boolean deleteMovie(MovieDTO movie);
	String searchMovie(String movieName);
	
	
	
}
