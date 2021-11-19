package com.string;

import java.util.ArrayList;
import java.util.List;

public class MissingCharactersInPangramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The quick brown fox jumps " + 
				"over the dog";
		
		List<Character> chList = getMissingCharacters(s);
		
		for(Character c: chList) {
			System.out.print(c);
		}
	}
	
	static List<Character> getMissingCharacters(String str){
		
		int n = str.length();
		int index = 0;
		boolean[] mark = new boolean[256];
		
		for(int i = 0 ; i < n; i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				mark[ str.charAt(i) - 'A'] = true;
			}
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				 mark[str.charAt(i) - 'a'] = true;
			}
			
		}
		List<Character> chrList = new ArrayList<Character>();
		for(int i = 0 ;i < 26; i++) {
			if(mark[i] == false) {
				chrList.add( (char)( i  + 'a'));
			}
		}
		
		return chrList;
	}

}
