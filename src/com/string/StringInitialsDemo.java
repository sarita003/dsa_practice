package com.string;

public class StringInitialsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name  = "Sarita Kumari Singh";
		
		printInitials(name);
	}
	
	static void printInitials(String str) {
		
		System.out.print( Character.toUpperCase(str.charAt(0)));
		for(int i = 1; i< str.length(); i++) {
			if(str.charAt(i) == ' ') {
				System.out.print(" "+ Character.toUpperCase(str.charAt(i+1)));
			}
		}
	}

}
