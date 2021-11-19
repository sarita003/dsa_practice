package com.array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOfCommonDivisor {

	public static void main(String[] args) {

		// taking input from bufferedReader
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();

		int num2 = in.nextInt();
		
		System.out.println("Numbers entered are : " + num1 + ", " + num2);

		int count = getCountOfCD(num1, num2);

		System.out.println("Count of Common Divisor : " + count);
		in.close();

	}

	private static int getCountOfCD(int num1, int num2) {
		// TODO Auto-generated method stub
		int maxNum = num1 > num2 ? num1 : num2;
		List<Integer> listOfCD = findCommonDivisor(num1, num2, maxNum);

		System.out.println("Common Divisor : " + listOfCD);

		System.out.println("Count : " + listOfCD.size());

		return listOfCD.size();
	}

	private static List<Integer> findCommonDivisor(int num1, int num2, int maxNum) {

		List<Integer> listOfCD = new ArrayList<Integer>();
		for (int i = 1; i <= maxNum; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				listOfCD.add(i);
			}
		}

		return listOfCD;

	}
}
