// @author Joseph Walker

// School assignment on method manipulation with an auto class example


import java.util.Scanner;

public class Auto {

// Here we create our instance variables for the class
	
	private String model;			// model of vehicle
	private int milesDriven;		// number of miles driven
	private double gallonsOfGas;	// number of gas gallons
	
	// Default constructor
	// Initialized model to "unknown";
	// milesDriven is auto-initialized to 0
	// gallonsOfGas to 0.0
	
	public Auto() {
		model = "unknown";
	}
	
	// Here we create an "overloaded Constructor":
	// Allows client to set beginning values for model,
	// milesDriven, and gallonsOfGas
	
	public Auto(String startModel, int startMilesDriven, double startGallonsOfGas) {
		model = startModel;
		setMilesDriven(startMilesDriven);
		setGallonsOfGas(startGallonsOfGas);
	}
	
	// Accessor method ("getter")
	// returns current value of model
	
	public String getModel() {
		return model;
	}
	
	// Accessor method
	// returns current value of milesDriven
	
	public int getMilesDriven() {
		return milesDriven;
		
	}
	
	// Accessor method:
	// returns current value of gallonsOfGas
	
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
		
	
	// Mutator method "setter"
	// allows client to set model
	
	public void setModel(String newModel) {
		model = newModel;
		
	}
	
	// Mutator method:
	// allows client to set value of milesDriven;
	// if new value is not less than 0
	
	public void setMilesDriven (int newMilesDriven) {
		if(newMilesDriven >= 0)
			milesDriven = newMilesDriven;
	}
	
	// Mutator method:
	// allows client to set value of gallonsOfGas
	// if new value is not less than 0.0
	
	public void setGallonsOfGas(double newGallonsOfGas) {
		gallonsOfGas = newGallonsOfGas;
	}
	
	// Calculates miles per gallon
	// if no gallons of gas have been used, return 0.0;
	// otherwise, returns miles per gallon
	// as milesDriven/gallonsOfGas
	
	public double milesPerGallon() {
		if (gallonsOfGas >= 0.0001)
			return milesDriven/gallonsOfGas;
	
		else 
			return 0.0;
}
	
	// Calculates money spent on gas
	// returns price per gallon times gallons of gas
		
		public double moneySpentOnGas(double pricePerGallon) {
			return pricePerGallon * gallonsOfGas;
		}
	}