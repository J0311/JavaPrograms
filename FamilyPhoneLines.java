// @author Joseph Walker

// Simple example of how to construct 2-Dimensional arrays in Java

public class FamilyPhoneLines {

	public static void main(String[] args) {

// we declare constants for the # of rows & columns
		
		final int NUMBER_OF_MONTHS = 3;
		final int NUMBER_OF_PERSONS = 4;
		
// here we declare and instantiate our array
		
		double[][] familyPhoneLines = 
				
				new double[NUMBER_OF_MONTHS][NUMBER_OF_PERSONS];
		
// now we assign values to our array elements
		
		// ROW 1:
		familyPhoneLines[0][0] = 45.24;
		familyPhoneLines[0][1] = 54.67;
		familyPhoneLines[0][2] = 32.55;
		familyPhoneLines[0][3] = 25.61;
		
		// ROW 2:
		familyPhoneLines[1][0] = 65.29;
		familyPhoneLines[1][1] = 49.75;
		familyPhoneLines[1][2] = 32.08;
		familyPhoneLines[1][3] = 26.11;
		
		// ROW 3:
		familyPhoneLines[2][0] = 75.24;
		familyPhoneLines[2][1] = 54.53;
		familyPhoneLines[2][2] = 34.55;
		familyPhoneLines[2][3] = 28.16;
		
		System.out.println("The first monthly phone bill for the "
				+ " first family member is\n" + familyPhoneLines[0][0]);
		
		System.out.println();
		
		System.out.println("The last monthly cell bill for the "
				+ "last family member is\n" + familyPhoneLines[NUMBER_OF_MONTHS -1][NUMBER_OF_PERSONS -1]);
		
		int numRows = familyPhoneLines.length;
		
		System.out.println("\nThe number of rows is " + numRows);
		
		for (int i = 0; i < numRows; i++){
			
			System.out.print("The number of columns in row " + i + " is ");
			
			System.out.println(familyPhoneLines[i].length);
			
			}
	
// We use a "nested" for loop to print all elements of 2-dimensional array
		
			for (int i = 0; i < familyPhoneLines.length; i++) {
				for(int j = 0; j < familyPhoneLines[i].length; j++) {
					System.out.println(familyPhoneLines[i][j] + "\t");
				}
		}

	}

}
