package com.string;

public class FirstNonRepeatingCharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hoolha";

		int nonRepeatingCharacterIndex = getFirstNonRepeatingCharacter(str);
		
		if(nonRepeatingCharacterIndex == -1)
			System.out.println("Not prsent");
		else
			System.out.println(str.charAt(nonRepeatingCharacterIndex));
		
		if(getFirstNonRepeatingCharacter_v2(str) == -1)
			System.out.println("Not prsent");
		else
			System.out.println(str.charAt(nonRepeatingCharacterIndex));
	}

	private static int getFirstNonRepeatingCharacter(String str) {
		// TODO Auto-generated method stub
		int[] fi = new int[256];
		
		for(int i =0 ; i < 256 ; i++) {
			fi[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			if (fi[str.charAt(i)] == -1) {
				fi[str.charAt(i)] = i;
			} else {
				fi[str.charAt(i)] = -2;
			}
		}

		int res = Integer.MAX_VALUE;

		for (int i = 0; i < 256; i++) {
			//System.out.println(fi[i]);
			if (fi[i] >= 0)
				res = Math.min(res, fi[i]);
		}

		// if res remains Integer.MAX_VALUE, it means there are no
		// characters that repeat only once or the string is empty
		if (res == Integer.MAX_VALUE)
			return -1;
		else
			return res;
	}
	
	static int getFirstNonRepeatingCharacter_v2(String str) {
		// TODO Auto-generated method stub
		int index = -1;
		
		boolean flag = false;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			
			int count_occurence = str.length() - str.replace(Character.toString(str.charAt(i)).toLowerCase(), "").length();
			
			if (count_occurence == 1) {
				 
                flag = true;
 
                index = i;
 
                break;
            }
		}
		
		if(flag) {
			return index;
		}else
			return -1;

	}

}
