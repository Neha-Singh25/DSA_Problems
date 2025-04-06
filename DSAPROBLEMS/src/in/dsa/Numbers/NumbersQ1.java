// 1. Java program to Find Odd or Even number 

package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:=");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + ", Number is even.");
		}
		else {
			System.out.println(num + ", Number is odd.");
		}
	}
}
