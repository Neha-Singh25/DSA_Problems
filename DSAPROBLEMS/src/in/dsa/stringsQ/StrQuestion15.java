// Java program to gives Output: a2b2c3d2 for the Input String Str = “aabbcccdd”
package in.dsa.stringsQ;

public class StrQuestion15 {
	public static void main(String[] args) {
		 String str = "heellllooooo.......";
		 printStr(str);
	}
	public static void printStr(String str) {
		StringBuilder res = new StringBuilder();
		int i =0;
		int j = str.length();
		int count = 1;
		while(i < j) {

			if( i+1 < j && str.charAt(i)== str.charAt(i+1)) {
				count ++;
				i++;
			}
			else {
				res.append(str.charAt(i)).append(count);
				i++;
				count = 1;
			}
		}
		
		System.out.println(res.toString());
	}
}
