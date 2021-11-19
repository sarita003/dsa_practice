package com.string;

public class ChangeStringToNewCharacterSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charSet[] = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
		String str = "egrt";
		String str1 = conversion(charSet, str);
		System.out.println(str1);

		str = conversion_v2("qwertyuiopasdfghjklzxcvbnm", str);
		System.out.println(str);
	}

	static String conversion(char[] charSet, String str) {

		int n = str.length();
		char[] hashChar = new char[26];
		for (int i = 0; i < 26; i++) {
			int ch = Math.abs(charSet[i] - 'a');
			hashChar[ch] = (char) (i + 'a');
		}
		String s = "";
		for (int i = 0; i < n; i++) {
			s += hashChar[str.charAt(i) - 'a'];
		}
		return s;
	}

	static String conversion_v2(String charSet, String str) {

		String s = "";
		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (char c : str.toCharArray()) {
			s = s + alphabets[charSet.indexOf(c)];
		}
		return s;
	}

}
