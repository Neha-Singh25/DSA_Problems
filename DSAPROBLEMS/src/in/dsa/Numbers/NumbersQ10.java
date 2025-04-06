// 10. Java program to calculate the sum of digits of a number.
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:=");
		int num = sc.nextInt();
		int orgnum = num;
		int ld = 0;
		int sum =0;
		while(num != 0) {
			ld = num % 10;
			sum += ld;
			num /= 10;
		}
		System.out.println(orgnum +" , number digits sum is :="+ sum);
	}
}
