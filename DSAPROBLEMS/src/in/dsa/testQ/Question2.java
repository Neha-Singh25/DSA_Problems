package in.dsa.testQ;

public class Question2 {
	public static  boolean isValid(int arr[], int n, int m, int maxAllowedPages) {
		int std = 1, pages = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] > maxAllowedPages) {
				return false;
			}
			if(pages + arr[i] <= maxAllowedPages) {
				pages += arr[i];
			}
			else {
				std++ ;
				pages = arr[i];
			}
		}
		return std > m ? false : true;
	}
	public static int allocatedBook(int arr[], int n, int m) {
		if(m >n) {
			return -1;
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {   //O(n)
			sum += arr[i];
		}
		int ans = -1;
		int st = 0, end = sum;    //range of possible ans
		while(st <= end) {     // O(logN * n)
			int mid = st + (end - st)/2;
			if(isValid(arr, n,m, mid)) {   //left
				ans = mid;
				end = mid - 1;
			}
			else {    //right
				st = mid + 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {15, 17, 20};
		int n = 3, m = 2;
		System.out.println(allocatedBook(arr, n, m));
	}
}
