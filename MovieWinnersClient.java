//@author Joseph Walker


import java.util.Scanner;

// Client for our MovieWinners class

public class MovieWinnersClient {
	
	public static void main(String[] args) {
		
// Instantiate the winningIDs array
		
		MovieWinners winningIDs = new MovieWinners();
		
// Scanner is created to prompt for member ID
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the member's ID " + "or 0 to stop > ");
		
		int searchID = input.nextInt();
		
		while (searchID != 0)
		{
// Determine whether member is a winner
			
		System.out.println(winningIDs.getPrize(searchID));
		
		System.out.println("\nEnter the next member's ID " + "or 0 to stop >");
		
		searchID = input.nextInt();
		
		}
		
		System.out.println("The winners were " + winningIDs.toString());
		}
		
		
	}


