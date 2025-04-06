// 8. Java program to find number of digits in given number
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:=");
		int num = sc.nextInt();
		int orgnum = num;
		int count = 0;
		int ld = 0;
		while( num != 0) {
			ld = num % 10;
			count ++;
			num /= 10;
		}
		System.out.println(orgnum +" , having "+ count + " digits");
	}
}
