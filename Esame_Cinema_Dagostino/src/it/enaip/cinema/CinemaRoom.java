package it.enaip.cinema;

import java.util.HashMap;
import java.util.Random;

public class CinemaRoom {

	HashMap<Viewer, Ticket> viewerList;
	Ticket t;
	Random r;

	public CinemaRoom() {

		viewerList = new HashMap<Viewer, Ticket>();
		r = new Random();

	}

	public void enterRoom(String id, String firstName, String lastName, String birthDate, int age) {

		int x = r.nextInt(99)+1;
		
		
		viewerList.put(new Viewer(id, firstName, lastName, birthDate, age), new Ticket(t.getPrice(),t.setSeat(x)));

	}

}
