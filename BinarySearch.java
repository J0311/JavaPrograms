//@author Joseph Walker

// Binary search algorithm for sorting arrays

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
	
	
// Define an array sorted in ascending order
	
	int[] numbers = {3, 6, 7,8, 12, 15, 22, 36, 45,
					48, 51, 53, 64, 69, 72, 89, 95};

	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a value to search for > ");
	int key = input.nextInt();
	
	int index = binarySearch(numbers, key);
	if(index != -1)
		
	{
		System.out.println(key + " found at index " + index);
		
	}
	
	else {
		
		System.out.println(key + " not found");
	}
	}
	
	public static int binarySearch(int[] arr, int key)
	
	{
		int start = 0;
		int end = arr.length-1;
		int middle;
		
		while(end >= start)
		{
			middle = (start + end)/2; // element in center of array
			
			if(arr[middle]== key)
				
			{

				return middle; // key found in center
			
			}
		
			else if(arr[middle] > key)
				
			{
				end = middle - 1; // search left side of array
			}
			else {
				
				start = middle +1; // search right side of array
			}
		}
	
		return -1;
				
			}
			
	}