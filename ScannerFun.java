//@author Joseph Walker

// Basic application which takes user input and outputs based on conditional statements

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random; 

public class ScannerFun {
	
	public static void main(String[] args) {
		
		//Initiating Scanner class with "info" as class name.
		
		Scanner info = new Scanner(System.in);
		System.out.println("Welcome! Please, enter your first name.");
		String firstName = info.next();
		
		System.out.println("Hi "+firstName+ "- the number of letters in your name is "+ firstName.length()+ ". What year were you born?");
		int yearOfBirth = info.nextInt();
		int current = 2022;
		
		//Here is where we utilize the DecimalFormat class imported
		
		DecimalFormat expect = new DecimalFormat("0.0#%");
		final double LIFE_EXPECTANCY = 78.94;
		double ratio = ((current - yearOfBirth) /78.94);
		
		System.out.print("You're so young! This year, you will ONLY be "+ (current - yearOfBirth));
		System.out.println(", which is just "+ expect.format((ratio))+ " of your life expectancy.\n"+firstName+ ", pick a number, 1-20?");
		
		//Here is where we utilize the Random class imported 
		
		Random	numberFun = new Random();
		
		//Generate a random number between 0 and 20
		
		int guess =info.nextInt(20)+1;
		int start = 0, end = 20;
		int accuracy = end - guess;
		
		int number = numberFun.nextInt(end - start + 1) + start;
		System.out.println("\nThe random number between " + start + " and " + end + " is " 
		+ number + ". You were off by "+ accuracy+ ".\n" +firstName + ", you had a great time in this short program - true or false?");
		
		
		// If Closing Statements
		
		boolean answer = info.nextBoolean();
		boolean agree = true;
		boolean disagree = false;
		
			if (answer == agree) {
				
			System.out.println("Thanks "+firstName + ", likewise! Have a great day my friend.");
				
			}
			else if (answer == disagree) { 
				
				System.out.println("Sorry to hear that "+firstName + ".\nWe're always open to feedback in the future. Have a good day!");
			}
	}
	
}
