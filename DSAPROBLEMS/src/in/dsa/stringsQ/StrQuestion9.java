// Java program to Count Vowels and Consonants in a given string
package in.dsa.stringsQ;

public class StrQuestion9 {
	public static void main(String[] args) {
		String str = "Ladakh";
		int vowelcount = 0;
		int conscount =0;
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u'
					) {
				vowelcount++;
			}
			else {
				conscount++;
			}
		}
		System.out.println("In "+str+ " having "+ vowelcount +" , vowels and "+ conscount + " , consonents.");
	}
}
