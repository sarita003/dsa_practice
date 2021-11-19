package com.string;

public class IntegerCheckInStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123dd";
		
		for(int i = 0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				System.out.println("String is not an Integer!!!!!!!!!!!!");
				break;
			}
		}
	}

}
