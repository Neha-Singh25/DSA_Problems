//Maximum difference of Zero's and One's . In a Binary String.
/*
 * 	Input : S = "11000010001"
	Output : 6
	From index 2 to index 9, there are 7
	0s and 1 1s, so number of 0s - number
	of 1s is 6.
 * 
 * 	Input : S = "1111"
	Output : -1
 * */

package in.dsa.testQ;

public class Question1 {
    public static void main(String[] args) {
        String str = "11000010001";
        System.out.println(maxDiff(str));
    }

    public static int maxDiff(String str) {
        int maxDiff = Integer.MIN_VALUE;
        int currentDiff = 0;
        
        for (int i = 0; i < str.length(); i++) {
            // Transform '0' to 1, and '1' to -1
            int value = (str.charAt(i) == '0') ? 1 : -1;
            currentDiff += value;

            // Update maxDiff if currentDiff is greater
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }

            // If currentDiff becomes negative, reset it
            if (currentDiff < 0) {
                currentDiff = 0;
            }
        }

        // If maxDiff is never updated (all 1's case), return -1
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}

