package com.array;
import java.util.HashSet;

public class PairSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,4,3,6};
		int k = 6;
		
		
		//isPairSum(arr,k);
		
		printPairSum(arr, arr.length, k);
		
	}

	private static void printPairSum(int[] arr, int length, int k) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		for(int i = 0 ; i <length ; i++) {
			int a = k - arr[i];
			if(set.contains(a)) {
				System.out.println("Pair Sum exists : (" + arr[i] + ","+a + ")");
			}
			set.add(arr[i]);
		}
	}

	private static void isPairSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int temp;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j< i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		System.out.println("Sorted Array : " )
		;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		int last = arr.length -1 , start = 0;
		boolean flag = false;
		
		while(start < last) {
			if(arr[start] + arr[last] == k) {
				flag = true;
				break;
			}else if(arr[start] + arr[last] < k) {
				start++;
				
			}else {
				last --;
			}
		}
		if(flag) {
			System.out.println("Pair sum exists  ");
		}else {
			System.out.println("Pair sum not exists");
		}
	}

}
