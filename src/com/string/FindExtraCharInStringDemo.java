package com.string;

public class FindExtraCharInStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "abcd";
		String strB = "bcsda";
		
		char c = getExtraChar(strA, strB);
		
		System.out.println(c);
	}
	
	static char getExtraChar(String strA, String strB) {
		
		int[] hash = new int[256];
		for(int i = 0; i < strB.length(); i ++) {
			hash[strB.charAt(i)]++;
		}
		
		for(int i = 0; i< strA.length(); i++) {
			hash[strA.charAt(i)]--;
		}
		
		for (int i = 0; i < hash.length; i++)
	    {
	 
	        // if the frequency is 1 then this
	        // character is which is added extra
	        if (hash[i]== 1)
	            return (char) i;
	    }
	    return Character.MIN_VALUE;
		
	}

}
