// Java program to print even indexed characters
package in.dsa.stringsQ;

public class StrQuestion11 {
	public static void main(String[] args) {
		String str = "Happiness";
		printEvenIndexedCharacters(str);
	}
	public static void printEvenIndexedCharacters(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(str.charAt(i)+ " ");
			}
		}
	}
}
