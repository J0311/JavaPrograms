
public class ByThrees implements Series {

	int val;

	public ByThrees() {

	}

	@Override
	public int getNext() {

		val += 3;
		return val;
	}

	@Override
	public void printStuff() {
		System.out.println("This is byThree!");
		
	}

}
