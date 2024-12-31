/*
 * Update operation we will be perform for change the bit value if bit is 0 then we set 1 if bit is one then set 0.
 * 
 * Approach:-
 * 1.) For Zero 0       // (clear operation)
 * 	   BitMask => 1 << i
 * 	   AND with NOT of BitMask.
 * 
 * 2.) For One 1       // (Set operation)
 * 	   BitMask => 1 << i
 *     Operation OR
 * 
 * */
package in.dsa.bitmanipulation;

import java.util.Scanner;

public class UpdateBit {
	public static void main(String[] args) {
		// Q:- Update the 2nd bit (position = 1) of a Number n to 1.(here n =5).
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bit do you want to update it's 1 or 0.");
		int operation = sc.nextInt();
		
		int n = 5;
		int pos = 1;
		
		int bitMask = 1 << pos;
		if(operation == 1) {
			//set
			int newNumber = bitMask | n;
			System.out.println(newNumber);
		}
		else {
			//clear
			int newBitMask = ~(bitMask);
			int newNumber = newBitMask & n;
			System.out.println(newNumber);
		}
	}
}
