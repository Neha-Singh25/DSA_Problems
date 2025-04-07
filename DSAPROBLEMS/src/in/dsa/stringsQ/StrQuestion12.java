// Java program to remove space from a given string
package in.dsa.stringsQ;

public class StrQuestion12 {
	public static void main(String[] args) {
		String str = "Welcome to your own World";
		System.out.println(removeSpaces(str));
	}
	public static String removeSpaces(String str) {
		StringBuilder newstr = new StringBuilder();
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				newstr.append(str.charAt(i));
			}
		}
		return newstr.toString();
	}
}
