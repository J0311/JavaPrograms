// @author: Joseph Walker

// Palindrome: 		 a word, phrase, or sequence that reads the SAME backward as it does forward (racecar, mom, nurses run)
 					 
public class Palindrome {

	public static void main(String[] args) {
		
		
		// Omit spaces in Java by using .replace() method which passes 2 args, similar
		// to how .replace() method works in Python.
		
		String original = "race car";
		original = original.replace(" ", "");
		
		// ensure for 1st part of conditional statement, set string.length to - 1 
		// because we know indices start at 0 index and onward
		
		String reverse = "";
		
		for (int i = original.length() - 1; i >= 0; i --) {
			reverse += original.charAt(i);
		}

		boolean palindrome = true;
		
		// what we want to do now, is get the char of 0 at the original and compare to char 
		// 0 of the reverse. IF those chars are NOT matching, we can set pallindrome to false. 
	
		
		for (int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if (palindrome) {
			System.out.println("PALINDROME!");
		}
		else {
			System.out.println("NOT PALINDROME!");
		}
	}

}
