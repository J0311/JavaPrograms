//@author Joseph Walker


import java.util.Random;

public class MovieWinners {

	public final int MEMBERS = 5000;

// Array to hold winning member numbers chosen at random

	private int [] winners;

// Parallel array that holds the prizes
	
	private String [] prizes = {"2 free movie tickets!",
								"1 free movie ticket!",
								"free popcorn",
								"free box of candy!"};
	
// Default constructor instantiates winners array
// while randomly generating winning member IDs
	
	public MovieWinners() 
	
	{
		winners = new int[prizes.length];
		fillWinners(); // will generate winner member IDs
	}
	
// Utility method generates winner member IDs and 
// stores them in the winners array
	
	private void fillWinners()
	
	{
		Random ran = new Random();
		for (int i = 0; i < winners.length; i++)
			
		{
			winners[i] = ran.nextInt(MEMBERS) + 1;
		}
		
		}
	
// Calls indexOfWinner with the member number, then translates
// return value into the prize won
	
	public String getPrize(int memberNumber)
	
	{
		int prizeIndex = indexOfWinner(memberNumber);
		if(prizeIndex == -1)
			
		{
			return "Sorry, member is NOT  winner.";
			
		}
		
		else {
			
			return "You win " + prizes[prizeIndex];
		}
	}
		
// Performs sequential search of winners array. Contains parameters of 
// key member ID to find in winners array.
// Returns index of key if found, -1 if not found
		
	private int indexOfWinner(int key)
		
		{
		
		for(int i = 0; i < winners.length; i++)
			
			{
			
		if(winners[i] == key)
					
				{
					
			return i;
				}
				
			return -1;
			
			}
		
		return key;
						
				}
		
// Returns printable version of MovieWinners object. Returns winning numbers 
// separated by a tab
			
			@Override
			
	public String toString()
	
			{
				
			String returnValue = "";
			for(int i = 0; i < winners.length; i++)
				
				{
				
				returnValue += winners[i] + "\t";
				
				}
			
			return returnValue;
			}
				
				
}
