/*
 * Operations are:-
 * 1. Get
 * 2. Set
 * 3. clear
 * 4. update
 * 
 * ---After performing the operation if we get non-zero value that means 1, otherwise 0.
 * */
package in.dsa.bitmanipulation;

public class OperationsOfBit {
	public static void main(String[] args) {
		// Here is the GetBit operation:-
		// When we find out the value of that particular position then we perform GET operation.
		/* 
		 * 1.) Bit-Mask => 1 << i
		 * 2.) AND operation
		 * */
		//Q:- Get the 3rd bit(position =2) of a number n = 5. (n= 0101).
		int n = 5;  //0101
		int pos = 3;
		int bitMask = 1 << pos;
		
		if((bitMask & n) == 0) {
			System.out.println("bit was zero "+ 0);
		}
		else {
			System.out.println("bit was one "+ 1);
		}
		
	}
}
