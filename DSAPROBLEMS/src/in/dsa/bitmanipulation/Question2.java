//Find a number is a power of 2 or not.
package in.dsa.bitmanipulation;

import java.util.Scanner;

public class Question2 {
	
	public static void checkPowerOfTwo(int n) {
		if((n & (n-1)) == 0) {
			System.out.println(n + " number is power of 2.");
		}
		else {
			System.out.println(n + " number is not power of 2.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:->");
		
		int n = sc.nextInt();
		checkPowerOfTwo(n);
	}
}
