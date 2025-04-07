// Java program to swap two string without using 3rd variable
package in.dsa.stringsQ;

public class StrQuestion14 {
	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = "All";
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()- str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Now after the swapping our string is :="+ str1 +" , " + str2);
	}
	
}
