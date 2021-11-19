package com.array;

public class ProblemsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {1, 2, 3, 4, 3, 5} ;
		int k = 3;
		
		int n =arr.length;
		
		int index = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] != k) {
				arr[index++] = arr[i];
			}
		}
		
		while(index < n) {
			arr[index++] = k;
		}
		
		System.out.println("Array New : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
