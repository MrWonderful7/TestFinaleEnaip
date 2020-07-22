package it.enaip.cinema;

import java.util.ArrayList;
import java.util.HashMap;

public class Cinema {
	
	private ArrayList<HashMap<Viewer, Ticket>> room;
	private int cashDeskCinema;
	public static Cinema instCinema;
	
	
	public Cinema() {
		
		room  = new ArrayList<HashMap<Viewer, Ticket>>();
	}


	public ArrayList<HashMap<Viewer, Ticket>> getRoom() {
		return room;
	}

	
	
	public static Cinema getInstance() {
		
		if(instCinema==null) {
			
			instCinema = new Cinema();
		}
		
		return instCinema;
	}
	
	
	
	
}
