package com.array;

public class MaxSubArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int n = arr.length;
		
		int maxSum = getMaxSubArraySum(arr, n);
		
		System.out.println("Maximum Sub Array Sum : "+ maxSum);
	}

	//arr = {-2, -3, 4, -1, -2, 1, 5, -3}
	public static int getMaxSubArraySum(int arr[], int n) {
		
		int max = arr[0];
		
		int sum = 0;
		
		for(int i=1; i<n ; i++) {
			
			sum += arr[i];
			
			if(sum > max) {
				max = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
			
		}
		
		return max;
		
		
	
	}
	
	
}
