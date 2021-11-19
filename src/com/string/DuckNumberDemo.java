package com.string;

public class DuckNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0012355";
		
		if(isDuckNumber(s)) {
			System.out.println("String "+ s + " is a Duck Number");
		}
	}
	
	static boolean isDuckNumber(String s) {
		int i = 0;
		int n = s.length();
		while( i < n && s.charAt(i) == '0') {
			i++;
		}
		
		while(i < n) {
			if(s.charAt(i) == '0') {
				return true;
			}
			i++;
		}
		
		
		return false;
	}

}
