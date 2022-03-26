// @author Joseph Walker

// Comparing the output between traditional and enhanced for loops of ArrayLists

import java.util.ArrayList;


public class ArrayListProcessing {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> list = new ArrayList<>();
	
		list.add(34);
		list.add(89);
		list.add(65);
		
// this is the structure of a "traditional for loop"
		
	System.out.println("Using the traditional for loop: ");
	for(int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i) + "\t");
	}
	System.out.println();
	
// here we use the "ENHANCED for loop" 
	
	System.out.println("\nUsing the ENHANCED for loop: ");
	for(Integer currentInteger : list) {
		System.out.print(currentInteger + "\t");
	}
	System.out.println();
		
	System.out.println("\nUsing unboxing and enhanced for loop: ");
		for(int currentInt : list) { //unboxing 
			System.out.print(currentInt + "\t");
	}
		System.out.println();
		
		list.set(1, 100);
		System.out.println("\nAfter calling set(1,100):");
		for(int currentInt : list) {
			System.out.print(currentInt + "\t");
		}
		System.out.println();
		
		int removed = list.remove(0);
		System.out.println("\nAt index 0, " + removed + " was removed");
		System.out.println("\nAfter removing the element at index 0: ");
		
		for(int currentInt : list) {
			System.out.print(currentInt + "\t");
			System.out.println();
		}
	}
	}


