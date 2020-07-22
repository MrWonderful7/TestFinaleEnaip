package it.enaip.cinema;

import java.util.ArrayList;

public class Movie {
	

	private String title, author, production, genre;
	private int duration;
	private ArrayList<Movie> movieStore;
	public static Movie instMovie;
	
	
	public Movie() {
		
		movieStore = new ArrayList<Movie>();
		
	}

	public Movie(String title, String author, String production, int duration, String genre) {
	
		this.title = title;
		this.author = author;
		this.production = production;
		this.duration = duration;
		this.genre = genre;
	}
	
	
	private void movieStore() {
		
		movieStore.add(new Movie("Pulp Fiction", "Quentin Tarantino", "Miramax", 178, "PULP"));
		movieStore.add(new Movie("Notting Hill", "Roger Michell", "Polygram Filmed Entertainment", 160, "ROMANCE"));
		movieStore.add(new Movie("Matrix", "Andy and Larry Wachowski", "Warner Bros", 150, "SCIENCE FICTION"));
		movieStore.add(new Movie("IT", "Tommy Lee Wallace", "Warner Bros", 190, "HORROR"));
		movieStore.add(new Movie("The Transporter", "Luc Besson", "TF1 Films Production", 92, "ACTION"));
		movieStore.add(new Movie("Ghostbusters", "Ivan Reitman", "‎Columbia Pictures‎", 107, "COMMEDY"));
	}
	
	public void roomMovie() {
		
		movieStore();
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
	
	
	public ArrayList<Movie> getMovieStore() {
		return movieStore;
	}

	public static Movie getInstance() {
		
		if(instMovie==null) {
			instMovie = new Movie();
		}
		
		return instMovie;
	}
	

}

