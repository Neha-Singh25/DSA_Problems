// 7. Java program to find Armstrong Number
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:=");
		int number = sc.nextInt();
		int orgnum = number;
		int count = 0;
		int ld =0;
		while(number != 0) {
			ld = number %10;
			count ++;
			number /=10;
		}
		number = orgnum;
		int sum = 0;
		int lig = 0;
		while(number != 0) {
			lig = number % 10;
			sum += Math.pow(lig, count);
			number /= 10;
		}
		if(orgnum == sum) {
			System.out.println(orgnum + " ,  is an armstrong number.");
		}else {
			System.out.println(orgnum + " , is not an armstrong number.");
		}
		
	}
}
