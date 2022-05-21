package firstjavaproject;

public class MultiplicationTable {

	// TODO Auto-generated method stub

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();

		}
	}

	void print(int table) {
		print(table, 11, 20); // refactoring
	}

	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d + %d = %d", table, i, table * i).println();
		}
	}

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		// table.print();
		table.print(4);
		// table.print(4, 11, 20);

	}

}