//4. Java program to swap two numbers without using third variable
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your two numbers for swapping:=");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("before swapping operation the value are :=" + num1+ " , " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("after swapping operation the value are :=" + num1+ " , " + num2);
	}
}
