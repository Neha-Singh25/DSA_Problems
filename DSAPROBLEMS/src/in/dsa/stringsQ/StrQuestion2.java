// Java program to reverse each word of a given string
package in.dsa.stringsQ;

public class StrQuestion2 {
	public static void main(String[] args) {
		String str = "Java is good programming langauges";
		revwordstr(str);
	}
	public static void revwordstr(String str) {
		String words[] = str.split(" ");
		
		String revs = ""; 
		for (int i =0; i< words.length; i++) {
			String word =words[i];
			String rev = "";
			char ch ;
			for(int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				rev = ch + rev;
			}
			revs = revs + rev + " ";
		}
		System.out.println("String is :=" + str);
		System.out.println("Reverse of word :=" + revs);
	
	}
}
