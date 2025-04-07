//Java program to reverse a string
package in.dsa.stringsQ;

public class StrQuestion1 {
	public static void main(String[] args) {
		String str = "CodingInJava";
		String revstr = "";
		char ch;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			revstr = ch + revstr;
		}
		System.out.println(revstr);
	}
}
