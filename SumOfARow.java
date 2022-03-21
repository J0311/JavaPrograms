//@author Joseph Walker

// how to tally up the sum of a row in a 2D array

import java.util.Scanner;
import java.text.NumberFormat;


public class SumOfARow {
	
	public static void main(String[] args) {
		
// Declare/initialize the array
		
		double [][] familyCellBills = {{ 45.24, 54.67, 32.55, 25.61},
										{65.29, 49.75, 32.08, 26.11},
										{75.24, 54.53, 34.55, 28.16}};
		
//	Since the rows correspond to the months, we declare and initialize a 
//	single-dimensional String array named months in order to make our prompt 
//	more user-friendly. 
		
		String [] months = {"July", "August", "September"};
		
		for (int i = 0; i < months.length; i++) {
			
//	We print a menu for the user, providing month names and the corresponding indexes. 

			System.out.println("Month " + i + " : " + months[i]);
			
			
		Scanner scan = new Scanner(System.in);
		int currentMonth;

//	Here, we use a do/while loop to prompt the user for a month index 
//	until the user enters a valid value between 0 and 2.
			
		do {
			System.out.println("enter a month number between 0 and 2 >");
			currentMonth = scan.nextInt();
		}
		while(currentMonth < 0 || currentMonth > 2);
		
//	To calculate the total of the family cell bills for the month index that the 
//	user inputs, we first initialize the variable monthlyFamilyBills to 0.0 	
		
		double monthlyFamilyBills = 0.0;
		
//	We then use a single for loop, following the pattern described earlier, to sum 
//	all the family member bills for the month chosen by the user.
		
		for (int j = 0; j < familyCellBills[currentMonth].length; j++) {
			
// add current family member bill to total for EACH iteration of our for loops
			
			monthlyFamilyBills += familyCellBills[currentMonth][j];
			
		}
		 
		NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
		
// We then format and output the total shows the output of the program 
// when the user chooses 1 for the month.
		
		System.out.println("\nThe total family cell bills during " + months[currentMonth]
				+ " is " + priceFormat.format(monthlyFamilyBills));
		}
		}
}