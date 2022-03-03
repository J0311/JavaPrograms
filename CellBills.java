//@author Joseph Walker

import java.util.Scanner;

public class CellBills {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double [] cellBills = new double [6];
		
		cellBills[0] = 45.24;
		cellBills[1] = 56.67;
		cellBills[2] = 42.55;
		cellBills[3] = 44.61;
		cellBills[4] = 65.29;
		cellBills[5] = 49.75;
		
		System.out.println(CellPhone.class.descriptorString());
			
	System.out.println("Element Value");
	
		for (int i = 0; i < cellBills.length; i++) {
		System.out.println(i + "\t" + cellBills[i]);
		}
		System.out.println("");
		System.out.println(cellBills[5]);
		
		
		

		
		
	}

}
