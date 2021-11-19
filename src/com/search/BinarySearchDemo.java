package com.search;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.println("Element Not present");
		} else {
			System.out.println("Element Present at index : " + result);
		}
	}

}

class BinarySearch {
	int binarySearch(int arr[], int start, int end, int x) {

		if (end >= start) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				return binarySearch(arr, mid + 1, end, x);

			} else {
				return binarySearch(arr, start, mid - 1, x);
			}
		} else {
			return -1;
		}

	}
}
