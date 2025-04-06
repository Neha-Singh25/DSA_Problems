/*
1. Java program to Find Odd or Even number 
2. Java program to find Prime number 
3. Java program to find Fibonacci series upto a given number range
4. Java program to swap two numbers without using third variable
5. Java program to Find Factorial on given Number
6. Java program to Reverse Number 
7. Java program to find Armstrong Number
8. Java program to find number of digits in given number
9. Java program to find Palindrome number
10. Java program to calculate the sum of digits of a number 
*/
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
