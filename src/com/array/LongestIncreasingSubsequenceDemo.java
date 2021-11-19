package com.array;

public class LongestIncreasingSubsequenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		
		int n = arr.length;
		
		int lengthOfLIS = getLIS(arr, n);
		
		System.out.println("The length of LIS is "+lengthOfLIS);
	}

	private static int getLIS(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int[] LIS = new int[n];
		int i , max =0;
		for( i = 0; i< n;i++) {
			LIS[i] = 1;
		}
		
		for(i =1; i< n; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(arr[i] > arr[j] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] + 1;
				}
			}
		}
		/* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < LIS[i])
                max = LIS[i];
 
        return max;
		
	}

}
