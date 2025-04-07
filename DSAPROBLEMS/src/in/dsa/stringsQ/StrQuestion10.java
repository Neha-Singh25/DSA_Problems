// Java program to print unqiue characters
package in.dsa.stringsQ;

public class StrQuestion10 {
	public static void main(String[] args) {
		String input ="Java Automation";
		printUniqueCharacters(input);
	}
	public static void printUniqueCharacters(String input) {
		boolean unique[] = new boolean[256];
		for(int i =0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch + " ");
			}
		}
	}
}
