/* When we want set 1 bit on the given position then we will perform SET operation.
 * Here we perform set operation.
 * Approach:-
 * 1.) BitMask => 1 << i
 * 2.) operation OR
 * */
package in.dsa.bitmanipulation;

public class SetOperation {
	public static void main(String[] args) {
		//Q:- Set the 2nd Bit(position = 1) of a number n.(n=5)
		
		int n = 5;
		int pos = 1;
		int bitMask = 1 << pos;
		
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}
}
