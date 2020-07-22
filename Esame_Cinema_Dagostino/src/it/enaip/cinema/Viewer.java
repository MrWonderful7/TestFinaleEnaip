package it.enaip.cinema;

public class Viewer {
	
	
	private String id, firstName, lastName, birthDate;
	private int age, seat, ticketPrice;
	
	
	public Viewer() {
		
		
	}

	public Viewer(String id, String firstName, String lastName, String birthDate, int age, int seat, int ticketPrice) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.age = age;
		this.seat = seat;
		this.ticketPrice = ticketPrice;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getSeat() {
		return seat;
	}

	public int setSeat(int seat) {
		return seat;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	

}
