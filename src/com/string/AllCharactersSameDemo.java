package com.string;

public class AllCharactersSameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ggggg";
		
		boolean isSameCharacter = isAllCharacterSame(str);
		if(isSameCharacter) {
			System.out.println("Same character found");
		}
	}

	private static boolean isAllCharacterSame(String str) {
		// TODO Auto-generated method stub
		for(int i = 1; i < str.length() ; i ++) {
			if(str.charAt(0) != str.charAt(i))
				return false;
		}
		
		return true;
	}

}
