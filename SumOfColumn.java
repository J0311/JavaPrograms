//@author Joseph Walker

// how to extract MAX value of a column in a multidimensional array

import java.util.Scanner;
import java.text.NumberFormat;

public class SumOfColumn {
	
	public static void main(String[] args) {
		
// Declare/initialize the array
		
		double [][] familyCellBills = {{ 45.24, 54.67, 32.55, 25.61},
						{65.29, 49.75, 32.08, 26.11},
						{75.24, 54.53, 34.55, 28.16}};
	
// We declare and initialize a single-dimensional String array named familyMembers 
// to make our prompt more user-friendly
		
		String[] familyMembers = {"Joe", "Jane", "Mike", "Sarah"};
		
		 for (int i = 0; i < familyMembers.length; i++) {
			 
			 System.out.println("Family member " + i + " : " + familyMembers[i]);
		 }
		Scanner scan = new Scanner(System.in);
		
		int currentMember; 
		
// We again use a do/while loop to prompt the user for a valid family member index
		
		do {
			System.out.println("Enter a family member between 0 and 3 > ");
			
			currentMember = scan.nextInt();
		}
		while (currentMember < 0 || currentMember > 3);
		
// To calculate the maximum value of the family member cell bills, we first initialize 
// the variable memberMaxBill to the first element in the column (familyCellBills[0][currentMember])
		
		double memberMaxBill = familyCellBills[0][currentMember];
		
// We then use a standard for loop, following the pattern described earlier to update 
// the value of memberMaxBill as necessary. 
// ** SPECIAL NOTE** we do NOT need to start the row at index 0 because we 
// initialized memberMaxBill to the value of the element in row 0 of the column currentMember
		
			for(int i = 1; i < familyCellBills.length; i++) {
				
				if(currentMember < familyCellBills[i].length) {
					
					if(familyCellBills[i][currentMember] > memberMaxBill) {
						
						memberMaxBill = familyCellBills[i][currentMember];
					}
				}
				

// The value of the variable memberMaxBill is then formatted and printed
				
		NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("\nThe max cell bill for " +familyMembers[currentMember] + " is "
				
					+ priceFormat.format(memberMaxBill));
				
			}
		}
		 }
