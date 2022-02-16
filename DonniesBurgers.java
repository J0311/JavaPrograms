// @author Joseph Walker

// Order from a menu with utilization of Compound Loop condition

import java.util.Scanner;
import java.text.DecimalFormat;


public class DonniesBurgers {
	
	public static void main(String[] args) {
		
// String variables of menu items to select hard-coded
		
		String menu = "\tC Cheeseburger: $7.49";
			   menu += "\n\tH Hot dog: $6.99";
			   menu += "\n\tL Lemonade: $2.50";
			   menu += "\n\tT Iced tea: $2.75";
			   
			   
		char option;
		double orderCost = 0;
		

		DecimalFormat pay = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Donnie's Burgers.\nSelect from our menu: ");
		System.out.println(menu); 
		
//This will print menu
		
		System.out.println("Order an item, " + "or \"S\" to stop > ");
		
// Scanner class method next called in conjunction with charAt() to 
// read 0 index of string for our loop condition
		
		option = input.next().charAt(0);
		
// Compound loop with nested switch statements:
		
		while (option != 'S' && option !='s') {
			
			switch (option) {
			case 'c':
			case 'C':
				System.out.println("Cheeseburger ordered. ");
				orderCost += 7.49;
				break;
				
			case 'h':
			case 'H':
				System.out.println("Hot dog ordered. ");
				orderCost += 6.99;
				break;
				
			case 'l':
			case 'L':
				System.out.println("Lemonade ordered. ");
				orderCost += 2.50;
				break;
				
			case 't':
			case 'T':
				System.out.println("Iced tea ordered. ");
				orderCost += 2.75;
				break;
				
			default:
				System.out.println("Unrecognized menu item.");
			}
			
			System.out.println("Subtotal: " + pay.format(orderCost));
			System.out.println( "\nOrder another item, " + "or \"S\" to stop >");
			
			option = input.next().charAt(0);
		}
		
// DecimalFormat API method called and passed double variable with #.00 format	
		
			System.out.println("\nTotal order cost is " + pay.format(orderCost));
			
				
			}
		}
		
	


