package com.dp;

import java.util.Arrays;

public class KnapsackProblem {

	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        
        int W = 50;
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i = 0; i < n + 1; i++)  
            for(int j = 0; j < W + 1; j++)  
                dp[i][j] = -1; 
        System.out.println(knapSack(W, wt, val, n,dp));
	}

	static int knapSack(int w, int[] wt, int[] val, int n, int[][] dp) {

		
		//base case
		if(n == 0 || w ==0) return 0;
		
		if(dp[n][w] != -1) {
			return dp[n][w];
		}
		
		if(wt[n-1] > w) {
			return dp[n][w] = knapSack(w, wt, val, n-1, dp);
		}else {
			return dp[n][w] = Math.max(val[n-1] + knapSack(w - wt[n-1], wt, val, n-1, dp) , knapSack(w , wt, val, n-1,dp));
		}
		
	}
}
