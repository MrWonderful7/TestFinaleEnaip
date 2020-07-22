package it.enaip.cinema;

import java.util.ArrayList;
import java.util.Random;

public class CinemaRoom {

	ArrayList<Viewer> vision, viewerList;
	Random r, movieRandom, viewerRandom;

	public CinemaRoom() {

		r = new Random();
		movieRandom = new Random();
		viewerRandom = new Random();
		vision = new ArrayList<Viewer>();
		viewerList = new ArrayList<Viewer>();

	}

	private void enterCinema(String id, String firstName, String lastName, String birthDate, int age, int seat,
			int price) {

		Cinema.getInstance().getRoom().add(new Viewer(id, firstName, lastName, birthDate, age, price, seat));
	}

	private void refillRoom() {
		int x = r.nextInt(99) + 1;
		enterCinema("01", "Gajeel", "RedFox", "06/06/1990", 30, 10, x);
		enterCinema("02", "Levy", "MacGarden", "17/09/1995", 25, 10, x);
		enterCinema("03", "Natsu", "Dragoneel", "07/07/1993", 27, 10, x);
		enterCinema("04", "Makarov", "Dreyar", "28/03/1945", 75, 10, x);
		enterCinema("05", "Erza", "Scarlet", "21/01/1992", 20, 10, x);
		enterCinema("06", "Spike", "Spiegel", "07/06/1983", 37, 10, x);
		enterCinema("07", "Chidory", "Kaname", "24/12/2004", 16, 10, x);
		enterCinema("08", "Madoka", "Ayukawa", "25/05/2005", 15, 10, x);
		enterCinema("09", "Sosuke", "Sagara", "07/07/2000", 20, 10, x);
		enterCinema("10", "Gray", "Fullbuster", "07/03/1994", 28, 10, x);
		enterCinema("11", "Juvia", "Lockser", "13/11/1996", 24, 10, x);
		enterCinema("12", "Mavis", "Vermillion", "06/08/1940", 80, 10, x);
		enterCinema("13", "Wendy", "Marvell", "14/06/2007", 13, 10, x);
		enterCinema("14", "Azuka", "Connell", "14/02/2016", 4, 10, x);
		enterCinema("15", "Minerva", "Orland", "10/10/2007", 13, 10, x);
	}

	public void movieRoom() {

		Viewer vw = null;
		int y = r.nextInt(14);
		
		int sum;
		Movie.getInstance().roomMovie();
		Movie daylyMovie = Movie.getInstance().getMovieStore()
				.get(movieRandom.nextInt(Movie.getInstance().getMovieStore().size()));
		Viewer daylyViewer = Cinema.getInstance().getRoom()
				.get(viewerRandom.nextInt(Cinema.getInstance().getRoom().size()));
		refillRoom();

		for (int i = 0; i < y; i++) {

			while (Movie.getInstance().getMovieStore().size() > 10) {

				vision.add(daylyViewer);
			}

		}

		for (Viewer dv : vision) {
			if (dv.getAge() < 5 || dv.getAge() >= 70) {

				dv.setTicketPrice(5);
			}
		}

		if (daylyMovie.getGenre().contains("HORROR")) {
			for (Viewer v : vision) {
				if (v.getAge() < 14) {
					vw = v;
					break;
				}
			}
		}

		if (vw != null) {
			vision.remove(vw);
		}
		
		int daylyMovieMoney=0;
		for (int i = 0; i < vision.size(); i++) 	
		daylyMovieMoney=+vision.get(i);
	}

	

}

}
