package com.array;

public class SortArray0s1sDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,0,0,0,0,1,1,1,1,0,0,0,1};
		
		int n = a.length;
		
		int count=0;
		for(int i = 0; i < n ; i++) {
			if(a[i] == 0) {
				a[count++] = a[i];
			}
		}
		
		while(count<n) {
			a[count++] = 1;
		}
		
		System.out.println("New Array Sorted :");
		for(int i =0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
