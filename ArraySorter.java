//@author Joseph Walker

// This class demonstrates the sorting of arrays with  
// selection sort algorithm


public class ArraySorter {
	
// A method to sort an integer array in ascending order
// parameter array the array to sort
	
public static void selectionSort (int[] array)

{
	int temp; // temporary location for data
	int max; // index of max value in subarray
	
	for(int i = 0; i < array.length - 1; i++)
		
	{
		
// Find index of largest value in subarray
		
		max = indexOfLargestElement(array, array.length - i);

// Swap array [max] and array [arra.length - 1 - i]
		
		temp = array[max];
		array[max] = array[array.length-i-1];
		array[array.length-i-1] = temp;
	}
}

// Finds index of largest element.

	public static int indexOfLargestElement(int[] array, int size)
	
	{
		int index = 0;
		for(int i = 1; i < size; i++)
			
		{
			if(array[i] > array[index])
				
			{
				index = i;
			}
			
			return index;
			
			}
		return index;
		
	}
}
