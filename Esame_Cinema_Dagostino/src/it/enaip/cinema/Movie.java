package it.enaip.cinema;

public class Movie {
	

	private String title, author, production, genre;
	private int duration;
	
	
	public Movie() {
		
		
	}

	public Movie(String title, String author, String production, int duration, String genre) {
	
		this.title = title;
		this.author = author;
		this.production = production;
		this.duration = duration;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	

}

