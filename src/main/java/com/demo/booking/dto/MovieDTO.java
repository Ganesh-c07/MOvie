package com.demo.booking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class MovieDTO {

	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer movieId;
	
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="release_year")
	private int releaseYear;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="director")
	private String director;
	
	@Column(name="runtime")
	private Integer runtime;
	
	@Column(name="language")
	private String Language;
	
	@Column(name="hero")
	private String hero;
	
	@Column(name="heroine")
	private String heroine;
	
	@Column(name="trailer_link")
	private String trailerLink;
	
	@Column(name="image_link")
	private String imageLink;
	
	
	public MovieDTO() {
		super();
	}
	
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Object getMovie() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

