package com.array;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		System.out.println(f.getFibonacciSeries(9));
	}

}

class Fibonacci {
	int getFibonacciSeries(int n) {
		
		if(n <= 1) {
			return n;
		}else {
			return getFibonacciSeries(n-1) + getFibonacciSeries(n-2);
		}
		
	}
}
