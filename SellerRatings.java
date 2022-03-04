//@author Joseph Walker

// client app for "Seller" class

public class SellerRatings {
	
	public static void main(String[] args) {
		
// Here we create a seller object passing seller name as argument
		
	Seller seller = new Seller ("Mary");
	
	seller.calcRating(4); // one value
	
// Display seller object while calling calcRating method from 
// our seller class
	
	System.out.println(seller);
	
	seller.calcRating(5,5); // two values
	System.out.println(seller);
	
	int[] arrayOfRatings = {4,4,5};
	seller.calcRating(arrayOfRatings); // array
	System.out.println(seller);
		
	
	seller.calcRating(); // no values
	System.out.println(seller);
	
	seller.setSellerName("Patricia");
	seller.calcRating(arrayOfRatings);
	System.out.println(seller);
		
	}

}
