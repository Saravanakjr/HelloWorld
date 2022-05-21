package Intro.oops;

public class Flights {

	private int seats;

	Flights(int seats) {
		this.seats = seats;
	}

	Flights() {
		this(200);
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		if (seats > 0) {
			this.seats = seats;
		}
	}

	void increaseSeats(int howmuch) {
		setSeats(this.seats + howmuch);
	}

}
