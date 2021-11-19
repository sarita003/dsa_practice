package com.string;

public class PermutationOfStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "keys";
		
		getPermutatedString(str);
	}
	
	static void getPermutatedString(String in) {
		
		StringBuilder sbOut = new StringBuilder();
		
		boolean[] mark =new boolean[in.length()];
		
		for(int i = 0 ; i< in.length(); ++i)
		{
			if(mark[i]) continue;
			
			sbOut.append(in.charAt(i));
			mark[i] = true;
			if(in.length() == sbOut.length() ) {
				System.out.println(sbOut);
			}
			//mark[i] = false;
			sbOut.setLength(sbOut.length() -1);
		}
	}

	private static void permute() {
		// TODO Auto-generated method stub
		
	}

}
