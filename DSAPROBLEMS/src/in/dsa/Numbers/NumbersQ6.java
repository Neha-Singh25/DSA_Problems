//6. Java program to Reverse Number 
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number:=");
		int num = sc.nextInt();
		int orgnum = num;
		int ld = 0;
		int rev = 0;
		while(num != 0) {
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}
		System.out.println(orgnum +" , numbers reverse is := "+ rev);
	}
}
