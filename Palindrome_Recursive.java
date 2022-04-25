// @author Joseph Walker

// Palindrome: 		a word, phrase, or sequence that reads the SAME backward as it does forward (racecar, mom, nurses run)

// Here is a palindrome program which uses RECURSION over iteration:  

public class Palindrome_Recursive {

	public static void main(String[] args) {
		

		String str = "nurses run";
		
// Omit spaces in Java by using .replace() method which passes 2 args, similar
// to how .replace() method works in Python.
		
		str = str.replace(" ", "");
		
		boolean result = isPalindrome(str);
		System.out.println(str + " IsPalindrome " + result);

	}
	
	public static boolean isPalindrome(String str) {
		
		if (str == null) {
			
			return false;
		}
		
// str.length is set <= 1 because even an EMPTY string is considered to be a palindrome 
		
		if (str.length() <= 1) {
			
			return true;
		}
		
// Use of substring method
		
		String first = str.substring(0,1);
		
		String last = str.substring(str.length() - 1, str.length());
		
// important to note that if first is NOT equals last, which returns false
		
		if(!first.equals(last)) {
			return false;
		}
		
// if first & last ARE equal, we will once again compare first to last by calling
// our isPalindrome method
		
		else {
			
			return isPalindrome(str.substring(1, str.length() - 1));
		}
	}
	
}
