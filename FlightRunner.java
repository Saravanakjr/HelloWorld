package Intro.oops;

public class FlightRunner {

	public static void main(String[] args) {
		Flights indigo = new Flights(100);
		Flights spicejet = new Flights(100);
		Flights flyemirates = new Flights();

		System.out.println("Default seats is " + indigo.getSeats());
		System.out.println("Default seats is " + spicejet.getSeats());
		System.out.println("Default seats is " + flyemirates.getSeats());

		// indigo.seats = 30;
		indigo.setSeats(50);
		spicejet.setSeats(20);
		flyemirates.setSeats(60);

		System.out.println("Intial seats is " + indigo.getSeats());
		System.out.println("Intial Seats is " + spicejet.getSeats());
		System.out.println("Intial seats is " + flyemirates.getSeats());

		indigo.increaseSeats(10);
		spicejet.increaseSeats(5);
		flyemirates.increaseSeats(20);

		System.out.println("Increased seats is " + indigo.getSeats());
		System.out.println("Increased Seats is " + spicejet.getSeats());
		System.out.println("Increased seats is " + flyemirates.getSeats());

	}
}
