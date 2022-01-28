import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		
		// Scanner Class Coding

				Scanner info = new Scanner(System.in);
				System.out.println("What's your first name?");

				String myName = info.next();
				System.out.println("Hey " + myName + " great to meet you! How old are you?");

				int myAge = info.nextInt();
				if (myAge < 60) {
				System.out.println("Wow you're young! In one word describe what you do for a living?");
				String profession = info.next();
				System.out.println("Sounds awesome. How long many years have you done this for?");

				int yearsOfWork = info.nextInt();
				
				System.out.println("You're a seasoned veteran!! Respect. \nRoses are red, true or false?");
						boolean momentOfTruth = info.nextBoolean();
				System.out.println("Right on....last request- please enter your middle initial");
				String midInitial = info.next();
				char midInitialM = midInitial.charAt(0);
				System.out.println("Your middle initial is "+midInitialM +" correct?");
				String response = info.next();
				System.out.println("Wonderful. Thanks for using this program!");
				}
					if (myAge>60) {
				System.out.println("Wow you're young! In one word describe what you do for a living?");
				String work = info.next();
				System.out.println("Sounds awesome. How long many years have you done this for?");

				int yearsOfJob = info.nextInt();
						
				System.out.println("You're a seasoned veteran!! Respect. \nRoses are red, true or false?");
								boolean momentOfTrue = info.nextBoolean();
				System.out.println("Right on....last request- please enter your middle initial");
				String middleInitial = info.next();
				char middleInitialM = middleInitial.charAt(0);
				System.out.println("Your middle initial is "+middleInitialM +" correct?");
				String tell = info.next();
				
				System.out.println("Wonderful. Thanks for using this program!");
					
					}
						else {
							//System.exit(start);
						}
					}
			}


