//3. Java program to find Fibonacci series upto a given number range
package in.dsa.Numbers;

import java.util.Scanner;

public class NumbersQ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number range:=");
		int num = sc.nextInt();
		int firstocc = 0;
		int secocc = 1;
		System.out.print(firstocc +" "+ secocc +" ");
		for(int i = 1; i <= num-2; i++) {
			int nextocc = firstocc + secocc;
			System.out.print(nextocc +" ");
			firstocc = secocc;
			secocc = nextocc;
		}
		
	}
}
