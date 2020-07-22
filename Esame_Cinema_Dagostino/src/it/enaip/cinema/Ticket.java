package it.enaip.cinema;

public class Ticket {
	
	
	private int seat;
	private int price = 10;
	

	public Ticket() {

	}
	
	public Ticket(int seat, int price) {
		
		this.seat = seat;
		this.price = price;
	}



	public int priceReduction(int age) {

		int discount=0;

		if (age < 5 || age >=70) {

			discount = price / 2;

		}

		return discount;

	}

	public int getSeat() {
		return seat;
	}



	public int setSeat(int seat) {
		this.seat = seat;
		
		return seat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
