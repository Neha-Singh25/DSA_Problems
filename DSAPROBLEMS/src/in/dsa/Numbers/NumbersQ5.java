//5. Java program to Find Factorial on given Number
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number for find the factorial:=");
		int num = sc.nextInt();
		int fact = 1;
		if(num < 0) {
		    System.out.println("Factorial is not defined for negative numbers.");
		}
		else if(num == 0 || num == 1) {
			System.out.println(num + "factorial is:=" + fact);
		}
		else {
			for(int i = num ; i >= 1 ; i--) {
				fact *= i;
			}
			System.out.println(num + "factorial is:=" + fact);
		}
	}
}
