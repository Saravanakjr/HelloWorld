package Intro.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book shakespere = new Book(1000);
		Book raina = new Book(1000);

		System.out.println("intial value " + shakespere.getNoofcopies());
		System.out.println("intial value " + raina.getNoofcopies());

		// shakespere.noofcopies = 100;
		shakespere.setNoofcopies(2);
		raina.setNoofcopies(3);
		System.out.println("fisrt copies " + shakespere.getNoofcopies());
		System.out.println("fisrt copies " + raina.getNoofcopies());
		shakespere.increaseCopies(10);
		raina.increaseCopies(20);
		System.out.println("After increasing " + shakespere.getNoofcopies());
		System.out.println("After increasing " + raina.getNoofcopies());
		shakespere.decreaseCopies(10);
		raina.decreaseCopies(20);

		System.out.println("After decreasing " + shakespere.getNoofcopies());
		System.out.println("After decreasing " + raina.getNoofcopies());

	}

}
