// Java program to determine if Two Strings are Anagrams
package in.dsa.stringsQ;

public class StrQuestion8 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent"; 
		System.out.println(areAnagrams(str1,str2));
	}
	public static boolean areAnagrams(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int check[] = new int[256];
		for(int i =0; i< str1.length(); i++) {
			check[str1.charAt(i)]++;
			check[str2.charAt(i)]--;
		}
		for(int count : check) {
			if(count != 0) {
				return false;
			}
		}
		return true;
	}
}
