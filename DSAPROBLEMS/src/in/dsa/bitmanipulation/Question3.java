//Count set Bits in a number.

package in.dsa.bitmanipulation;

import java.util.Scanner;

public class Question3 {
	
	public static int countSetBit(int n) {
		int count = 0;
		while( n > 0) {
			if((n & 1) != 0) {
				count ++;
			}
			n >>= 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :=");
		int n = sc.nextInt();
		//int count = countSetBit(n);
		System.out.println( n +", in this number set bits are =" + countSetBit(n));
	}
}
