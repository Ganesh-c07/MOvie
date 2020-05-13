package com.demo.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.booking.dto.MovieDTO;
import com.demo.booking.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService service ;
	@GetMapping("/viewAllMovies")
	List<MovieDTO> viewAllMovies(){
		return service.viewAllMovies();
	}
	
	@GetMapping( "/searchMovie/{movieName}")
	public String searchMovieByName(@PathVariable("movieName") String movieName){
		return service.searchMovie(movieName) ;
	}
	
	@PostMapping("/addMovies")
	String addMovie(@RequestBody MovieDTO Movie)
	{String status="Movie Added";
		if(service.addMovie(Movie)){
		return status;
		}
		return"Failed to add movie";
	}
	
	@PostMapping("/deleteMovies")
	String deleteMovie(@RequestBody MovieDTO movieId)
	{String status="Movie Deleted";
		if(service.deleteMovie(movieId)){
		return status;
		}
		return"Failed to add movie";
	}
}
