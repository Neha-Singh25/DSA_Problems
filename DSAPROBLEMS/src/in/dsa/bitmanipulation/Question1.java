//Check if a number is odd and even.
package in.dsa.bitmanipulation;

import java.util.Scanner;

public class Question1 {
	
	public static void checkOddEven(int n) {
		int bitMask = 1;
		if((n & bitMask) == 0) {
			System.out.println(n + " number is even.");
		}
		else {
			System.out.println(n + " number is odd.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:->");
		int n = sc.nextInt();
		checkOddEven(n);
	}
}
