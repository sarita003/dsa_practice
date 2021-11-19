package com.string;

public class SegregateEvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,8,9,6,2};
		
		System.out.println("Segregate Even Odd : ");
		segregateEvenOdd(arr);
		
		for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
	}
	
	
	static void segregateEvenOdd(int [] arr) {
		
		int cntEven = 0,temp;
		int n = arr.length;
		
		for(int i =0 ;i <n ;i ++) {
			if(arr[i] % 2 == 0) {
				
				
				temp = arr[i];
				arr[i]  = arr[cntEven];
				arr[cntEven] = temp;
				cntEven++;
			}
		}
		
		
	}
}
