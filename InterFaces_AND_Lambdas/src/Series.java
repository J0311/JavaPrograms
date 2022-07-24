
public interface Series {

	public final int MAX = 10;
	public final String ERRORMSG = "Cannot go above value " + MAX;

	// Functional interface which starts at 0.
	// each time this function is called, it's
	// incrementing value by certain amount.

	int getNext();

	// void method

	void printStuff();

	// static method

	static void printMoreStuff() {
		System.out.println("Live from New York: It's Saturday night.");
	}

	// default method

	default void printStuff2() {
		System.out.println("Live from New York: It's Saturday night.");
	}

}
