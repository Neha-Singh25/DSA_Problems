// Java program to count the number of words in a string
package in.dsa.stringsQ;

public class StrQuestion5 {
	public static void main(String[] args) {
		String str = "Welcome to Java World";
		countw(str);
	}
	public static void countw(String str) {
		int count = 1;
		for (int i =0 ; i< str.length()-1; i++) {
			if ( (str.charAt(i) == ' ') && (str.charAt( i +1) != ' ')) {
				count ++;
			}
			
		}
		System.out.println(count);
	}
}
