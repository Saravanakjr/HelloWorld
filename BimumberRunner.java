package Intro.oops;

public class BimumberRunner {
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doublevalue();
		System.out.println(numbers.getA());
		System.out.println(numbers.getB());

	}

}
