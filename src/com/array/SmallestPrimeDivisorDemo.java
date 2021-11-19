package com.array;
import java.util.Scanner;

public class SmallestPrimeDivisorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int lpd = getLeastPrime(num);
		
		System.out.println("Least Prime Divisor : "+lpd);
		
	}

	private static int getLeastPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num % 2 == 0) {
			return 2;
		}
		
		
		for (int i = 3; i * i <= num ; i+=2) {
			if(num % i == 0) {
				return i;
			}
		}
		
		return num;
	}
}
