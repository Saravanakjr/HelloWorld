package Intro.oops;

public class MotorBike {
	private int speed; // member variable

	void start() {
		System.out.println("Bike is Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {// local variable
		this.speed = speed;
		System.out.println(speed);
		System.out.println(this.speed);

	}

}
