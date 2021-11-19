package com.search;

public class FrontBackSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {60,70,80,90,100,10,20,30};
		int index =search(arr, arr.length, 20);
		if(index > 0) {
			System.out.println("Element Found at Index "+index);
		}else {
			System.out.println("Element Not Found");
		}
	}

	public static int search(int[] arr, int n, int x) {

		int front = 0, back = n - 1;
		while (front <= back) {

			if (arr[front] == x) {
				return  front;
			}else if(arr[back]==x) {
				return back;
			}
			front++;
			back--;

		}
		return -1;
	}

}
