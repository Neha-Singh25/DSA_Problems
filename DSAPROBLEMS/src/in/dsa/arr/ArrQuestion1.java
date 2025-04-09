// Find the missing number in an Array

package in.dsa.arr;

public class ArrQuestion1 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5, 6};
		System.out.println("Missing number is :=" + findmissnum(arr));
	}
	public static int findmissnum(int arr[]) {
		int n = arr.length + 1;
		int totalsum = n * (n+1) /2;
		int sum = 0;
		
		for( int ele : arr) {
			sum += ele;
		}
		return totalsum - sum;
	}
}
