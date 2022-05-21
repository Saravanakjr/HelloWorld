package Intro.oops;

public class BiNumber {
	private int a;
	private int b;
	// private int c;

	BiNumber(int a, int b) {
		this.a = a;
		this.b = b;
		// c = a + b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	int add() {
		int c = a + b;
		return c;
	}

	int multiply() {
		int c = a * b;
		return c;
	}

	void doublevalue() {
		this.a *= 2;
		this.b *= 2;

	}

}
