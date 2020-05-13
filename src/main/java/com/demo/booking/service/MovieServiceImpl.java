package com.demo.booking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.booking.dto.MovieDTO;
import com.demo.booking.repo.MovieRepo;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieRepo movieRepo;
	
	@Override
	public List<MovieDTO> viewAllMovies() {
		// TODO Auto-generated method stub
		return (List<MovieDTO>) movieRepo.findAll();
	}

	@Override
	public boolean addMovie(MovieDTO Movie) {
		 movieRepo.save(Movie);
		 return true;
	}

	@Override
	public String editMovie(MovieDTO Movie) {
		Optional<MovieDTO> findMovie=movieRepo.findById(Movie.getMovieId());
		if(!findMovie.isPresent() || findMovie == null) {
			movieRepo.save(Movie);
			return "Edited Succesfully";
		}
		return "No movie found for the given id!" ;	
	}

	@Override
	public boolean deleteMovie(MovieDTO Movie) {
			movieRepo.delete(Movie);
			return true;		
		}		
	

	@Override
	public  String searchMovie(String Movie) {
		
		String findMovie=movieRepo.findByMovieName(Movie);
		if(findMovie == null) {
			return "No movie found for the given id!" ;
		}
		return findMovie ;
	}


	}
	

