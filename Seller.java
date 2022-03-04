//@author Joseph Walker

// Variable arguments program: we are updating the average 
// rating a seller receives on an auction website. 
// Each seller could have a different number of new ratings, 
// so we specify the new ratings as a variable number of arguments.

import java.text.DecimalFormat; 

public class Seller {
	
	private String sellerName;
	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	private double rating;
	private int numberOfRatings;
	
	private static final DecimalFormat ONE_PLACE
						= new DecimalFormat("0.0");
	
// Constructor with parameter of seller name
	
	public Seller(String sellerName)
	
	{
		this.sellerName = sellerName;
	}
	
// calcRating method with 0 to many new ratings
	
	public void calcRating(int...newRatings)
	
	{
		if(newRatings != null && newRatings.length > 0)
			
		{
			int totalNewRatings = 0;
			for(int i = 0; i < newRatings.length; i++)
				totalNewRatings += newRatings[i];
			
			rating = ((rating * numberOfRatings) + totalNewRatings)
					/ (newRatings.length + numberOfRatings);
			numberOfRatings += newRatings.length;
		}
		
// "else", no new ratings, so NO change to instance variable
		
		}
	
// toString method to return seller name and rating
// formatted to 1 decimal place
	
	@Override
	
	public String toString()
	
	{
		return sellerName + ": rating " + ONE_PLACE.format(rating);
		
	}
	
	

}
