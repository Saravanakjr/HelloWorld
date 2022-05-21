package Intro.oops;

public class Book {
	private int noofcopies;

	Book(int noofcopies) {
		this.noofcopies = noofcopies;
	}

	public int getNoofcopies() {
		return noofcopies;
	}

	public void setNoofcopies(int noofcopies) {
		if (noofcopies > 0) {
			this.noofcopies = noofcopies;
		}

	}

	void increaseCopies(int howmuch) {
		setNoofcopies(this.noofcopies + howmuch);
		// return noofcopies;
	}

	void decreaseCopies(int howmuch) {
		setNoofcopies(this.noofcopies - howmuch);
	}
}
