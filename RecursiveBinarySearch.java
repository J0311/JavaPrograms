// @author Joseph Walker

import java.util.Scanner;


public class Recursive_Binary_Search {
	
	public static void main(String[] args) {
		
// define an array SORTED in "ascending" order
		
		int [] numbers = {3, 6, 7, 8, 12, 15, 22, 36, 45, 48, 51, 53, 64, 69, 72, 89, 95};
		
// In main, we begin by instantiating our array to search. Note that the values are in ascending order
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value to search for > ");
		
// We then prompt the user for the search key and make the call to the recursive binary 
// search method, passing the entire array as the sub-array to search. 		

		
		int value = scan.nextInt();
		
		int index = recursiveBinarySearch (numbers, value, 0, numbers.length - 1);
		
		
// We output the result of our search
		
		if (index != -1) 
			System.out.println(value + " found at index " + index);
		
		else 
			System.out.println(value + " not found");
		
	}
	
	
// Here we code the recursiveBinarySearch method.That method takes four parameters: arr, the array 
// we are searching; key, the value we are searching for; and start and end, which represent, respectively, 
// the first and last index of the sub-array of arr that we should search.
	
		public static int recursiveBinarySearch (int [] arr, int key, int start, int end) {
			
			
// Here we test if the subarray we are searching contains at least one element. If it does not, we have 
// reached a base case and we know that we will not find key. Thus, we return −1 in the else clause.  
			
			if (start <= end) {
				
// look at the middle element of the sub-array. If the sub-array has at least one element, 
//  we assign the index of the middle element of the subarray to middle
				
				int middle = (start + end) / 2;
			
			
			if (arr[middle] == key)  // found key, base case
				
// We then compare the array element at index middle to key. If they are equal, we have reached the other 
// base case (we have found key) so we return middle.
				
				return middle;
			
			
			else if (arr[middle] > key)  // look lower
				
// If the array element at index middle is greater than key, we call the recursiveBinarySearch method with 
// the sub-array consisting of all elements with values lower than middle (from start to middle − 1).
				
				return recursiveBinarySearch (arr, key, start, middle - 1);
				
// If the array element at index middle is smaller than key, then we call the recursiveBinarySearch method 
// with the subarray consisting of all elements with values higher than middle (from middle + 1 to end).
			
				
			else  // look higher
					return recursiveBinarySearch(arr, key, middle + 1, end);
			}
			
			else 
				
// both cases, whatever is returned by the recursive call is returned by the method.

				return -1;
				
			}
		
		}
