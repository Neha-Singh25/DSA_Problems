// Java program to find if a string is Palindrome.
package in.dsa.stringsQ;

public class StrQuestion7 {
	public static void main(String[] args) {
		String str = "madam"; 
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		int start = 0;
		int endidx = str.length()-1;
		while(start < endidx) {
			if(str.charAt(start) != str.charAt(endidx)) {
				return false;
			}
			start ++;
			endidx --;
		}
		return true;
	}
}
