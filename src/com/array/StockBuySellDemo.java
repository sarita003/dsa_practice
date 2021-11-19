package com.array;

public class StockBuySellDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,5,7,8,9,6};
		int n = arr.length;
		
		int maximumProfit = maximumProfit(arr, n);
		
		System.out.println("Maximum Profit : "+maximumProfit);
	}
	
	public static int maximumProfit(int[] arr, int n) {
		
		int minSoFar = arr[0];
		
		int maxProfit = arr[0];
		
		for(int i = 1 ; i< n; i++)
		{
			minSoFar = Math.min(minSoFar, arr[i]);
			int profit = arr[i] - minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		
		return maxProfit;
	}

}
