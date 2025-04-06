// 9. Java program to find Palindrome number
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:=");
		int num = sc.nextInt();
		int orgnum = num;
		int ld = 0;
		int rem = 0;
		while( num != 0) {
			ld = num % 10;
			rem = rem * 10 + ld;
			num /= 10;
		}
		if(rem == orgnum) {
			System.out.println(orgnum + ", is a palindrome number.");
		}else {
			System.out.println(orgnum + ", is not a palindrome number.");
		}
		
	}
}
