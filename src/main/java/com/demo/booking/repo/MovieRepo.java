package com.demo.booking.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.booking.dto.MovieDTO;

public interface MovieRepo extends CrudRepository<MovieDTO,Integer> {

	String findByMovieName(String movie);

}
