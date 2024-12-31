/* Here we will perform clear operation.
 * 
 * When we want to clear bit on the given position.then we perform clear operation.
 * (clear means ,Here we set the 0 bit )
 * 
 *  Approach :-
 *  1.) BitMask => 1 << i
 *  2.) AND with NOT of BitMask.
 *  
 * */
package in.dsa.bitmanipulation;

public class ClearOperation {
	public static void main(String[] args) {
		//Q:- clear the 3rd Bit (position = 2) of a number n = 5.
		
		int n = 5;
		int pos = 2;
		int bitMask = 1 << pos;
		int newBitMask = ~(bitMask);
		int newNumber = newBitMask & n;
		
		System.out.println(newNumber);
	}
}
