package com.string;

public class PangramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		 
        if (isPangram(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
	}
	//Pangram is a string which contains all letter of Alphabet
	static boolean isPangram(String str) {
		
		boolean[] mark = new boolean[26];
		int index  = 0;
		
		for(int i = 0 ; i < str.length(); i ++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			}else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}else
				continue;
			
			mark[index] = true;
		}
		
		for(int i = 0 ; i<= 25; i++) {
			if(mark[i] == false) {
				return false;
			}
		}
		
		return true;
				
		
		
	}

}
