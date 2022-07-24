
public class Main {

	public static void main(String[] args) {
		
		ByTwos byTwos = new ByTwos();
		
		byTwos.printStuff();
		Series.printMoreStuff(); 
	
	ByTwos byTwo = new ByTwos();
	ByThrees byThree = new ByThrees();
	
	byTwo.printStuff();
	
	Series ob; // We can point this "Series object"
				// at any of these classes and call the 
				// getNext method version it's point to
	
	
	for (int i = 0; i < 7; i++) {
		ob = byTwo;
		System.out.println("ByTwos: " + ob.getNext());
	}
	
	System.out.println();

	for (int i = 0; i < 5; i++) {
		ob = byThree;
		System.out.println("ByThrees: " + ob.getNext() + " ");
	}
}
}