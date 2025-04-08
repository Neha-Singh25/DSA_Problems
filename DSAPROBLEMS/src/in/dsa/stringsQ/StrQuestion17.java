// Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”
package in.dsa.stringsQ;

public class StrQuestion17 {
	public static void main(String[] args) {
		String str = "Subbu123raj";
		separateAplhaAndNumeric(str);
	}
	public static void separateAplhaAndNumeric(String str) {
		StringBuilder newStr = new StringBuilder();
		StringBuilder newdigit = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				newStr.append(ch);
			}
			else if(Character.isDigit(ch)) {
				newdigit.append(ch);
			}
		}
		System.out.println("Your String is :=" + str + " and now is :=> "+ newStr + " , " + newdigit);
	}
}
