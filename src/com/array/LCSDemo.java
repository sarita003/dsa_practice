package com.array;

public class LCSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String text1 = "AGGTAB";
		String text2 = "GXTXAYB";
		int m = s.longestCommonSubsequence(text1, text2);
		System.out.println("Length of LCS is "+m);
	}

}

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        char[] text1_arr = text1.toCharArray();
        char[] text2_arr = text2.toCharArray();
        
        int m = text1_arr.length;
        int n = text2_arr.length;
        int LCS[][] = new int[m+1][n+1]; 
        
        for(int i=0;i <= m; i++){
            for(int j=0; j<= n ; j++){
                if(i == 0 || j==0){
                    LCS[i][j] = 0;
                }
                else if(text1_arr[i-1] == text2_arr[j-1]){
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                }else{
                    LCS[i][j] = Math.max(LCS[i][j-1], LCS[i-1][j]);
                }
            }
        }
        return LCS[m][n];
    }
}