// Find the largest and smallest element in an Array
package in.dsa.arr;

public class ArrQuestion2 {
	public static void main(String[] args) {
		int arr[] = {5, 2, 9, 1, 6, 3};
		lrgsmlele(arr);
	}
	public static void lrgsmlele(int arr[]) {
		int lrg = Integer.MIN_VALUE;
		int sml = Integer.MAX_VALUE;
		for(int ele : arr) {
			if(ele > lrg) {
				lrg = ele;
			}
			else if(ele < sml) {
				sml = ele;
			}
		}
		System.out.println("int the arr largest ele is := " + lrg + " & smallest ele is := " + sml );
	}
}
