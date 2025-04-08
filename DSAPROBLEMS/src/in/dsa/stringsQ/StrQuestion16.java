// Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
package in.dsa.stringsQ;

public class StrQuestion16 {
	public static void main(String[] args) {
		String str = "aBACbcEDed";
		separateCharacters(str);
	}
	public static void separateCharacters(String str) {
		StringBuilder lowerchar = new StringBuilder();
		StringBuilder upperchar = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerchar.append(ch);
			}
			else {
				upperchar.append(ch);
			}
		}
		System.out.println("Lower Char are:=" + lowerchar.toString());
		System.out.println("Upper Char are:=" + upperchar.toString());
	}
}
