//@author Joseph Walker

import java.text.DecimalFormat;

// Illustrating the use of arrays with "CellPhone" class

public class CellPhone {
	
// This will  be default number of months	
	
	public final int MONTHS = 6; 
	private String phoneNumber;
	private double [] cellBills;
	
// Default constructor
	
	public CellPhone() {
		phoneNumber = "";
		cellBills = new double [MONTHS];
	}
	
// Constructor created with String and double array parameters
	
	public CellPhone (String phoneNumber, double[]cellBills) {
		this.phoneNumber = phoneNumber;
		
// Ensure we instantiate array with SAME length as our parameter
		
	this.cellBills = new double [cellBills.length];
	
// Copy parameter array to cellBills array
		
	for(int i = 0; i < cellBills.length; i++) 
	{
		this.cellBills[i] = cellBills[i];
	}
	}
// Accessor method which returns phone number
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
// Accessor method which returns phone bills and cellBills array
	
	public double[] getCellBills() 
	{
		double [] temp = new double [cellBills.length];
		for (int i = 0; i < cellBills.length; i ++) 
		{
			temp[i] = cellBills[i];
		}
		return temp;
		
		}
	// Method which calculates total of all cell phone bills
		public double calcTotalBills()
		{
			double total = 0.0;
			for(int i = 0; i < cellBills.length; i++)
			{
	// Add current element to total
				total += cellBills[i];
			}
			return total;
		}
	// This method finds largest (max) value in cellBills array
		
		public double findMaxBill()
		{
	// We assume our first element in array is the max
			
			double max = cellBills[0];
			for( int i = 1; i < cellBills.length; i++)
			{
				if(cellBills[i] > max)
				{
	// Here we will save new maximum
					
					max = cellBills[i];
				}
				
				return max;
			}
			return max;
			}
			
			@Override
	
			public String toString()
			{
				String returnValue = phoneNumber + "\n";
				DecimalFormat money = new DecimalFormat( "$##0.00");
				for (int i = 0; i < cellBills.length; i++)
				{
					returnValue += money.format(cellBills[i]) + "\t";
				}
				returnValue += "\n";
				
				return returnValue;
			}
			
		// Boolean method which compares CellPhone objects for equality
			
			@Override
			
			public boolean equals(Object c)
			{
				if(!(c instanceof CellPhone)) 
				{
					return false;
				}
					else
					{
						CellPhone objCP = (CellPhone) c;
						if(!(phoneNumber.equals(objCP.phoneNumber)))
						{ 
							return false;
						}
						if(cellBills.length != objCP.cellBills.length)
						{
							return false;
						}
						for (int i = 0; i < cellBills.length; i++)
						{
							if(cellBills[i] != objCP.cellBills[i])
							{
								return false;
							}
							return true;
							}
						}
				return false;
					}
}
