package com.string;

public class RearrangeCharactersDemo {

	public static void main(String[] args) {
		String str = "bbbaa";
		String res = rearrangeString(str);
		if (res == "") {
			System.out.println("Re arrange Characters Not valid");
		} else {
			System.out.println("Re arrange Characters " + res);
		}
	}

	static char getMaxCountChar(int[] count) {
		int max = 0;
		char ch = 0;
		for (int i = 0; i < 26; i++) {
			if (count[i] > max) {
				max = count[i];
				ch = (char) ('a' + i);
			}
		}

		return ch;
	}

	static String rearrangeString(String s) {

		int n = s.length();

		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		char ch_max = getMaxCountChar(count);
		int maxCount = count[ch_max - 'a'];

		// check if the result is possible or not
		if (maxCount > (n + 1) / 2)
			return "";

		char[] res = new char[n];

		int ind = 0;
		// filling the most frequently occuring char in the even
		// indices
		while (maxCount != 0) {
			res[ind] = ch_max;
			ind = ind + 2;
			maxCount--;
		}
		count[ch_max - 'a'] = 0;

		// now filling the other Chars, first filling the even
		// positions and then the odd positions
		for (int i = 0; i < 26; i++) {
			while (count[i] > 0) {
				ind = (ind >= n) ? 1 : ind;
				res[ind] = (char) ('a' + i);
				ind += 2;
				count[i]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < res.length; i++) {
			sb.append(res[i]);
		}
		return sb.toString();
	}

}