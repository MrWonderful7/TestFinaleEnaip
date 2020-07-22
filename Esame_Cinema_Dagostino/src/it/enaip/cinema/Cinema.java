package it.enaip.cinema;

import java.util.ArrayList;

public class Cinema {
	
	private ArrayList<Viewer> room;
	public static Cinema instCinema;
	
	
	public Cinema() {
		
		room  = new ArrayList<Viewer>();
	}

	public ArrayList<Viewer> getRoom() {
		return room;
	}

	public static Cinema getInstance() {
		
		if(instCinema==null) {
			instCinema = new Cinema();
		}
		
		return instCinema;
	}
	
	
	
	
}
