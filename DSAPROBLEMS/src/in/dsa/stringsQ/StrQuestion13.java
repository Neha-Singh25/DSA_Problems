// Java program to print each letter twice from a given string
package in.dsa.stringsQ;

public class StrQuestion13 {
	public static void main(String[] args) {
		String str = "hello coders";
		System.out.println(doubleCharacters(str));
	}
	public static String doubleCharacters(String str) {
		StringBuilder res = new StringBuilder();
		for(int i =0; i< str.length(); i++) {
			res.append(str.charAt(i)).append(str.charAt(i));
		}
		return res.toString();
	}
}
