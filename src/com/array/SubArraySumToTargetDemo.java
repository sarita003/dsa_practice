package com.array;
import java.util.ArrayList;
import java.util.List;

public class SubArraySumToTargetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 3, 5 };
		int k = 8;

		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		int start = 0, end = 0, currsum = 0;
		for (int i = 0; i < arr.length; i++) {
			currsum += arr[i];

			if (currsum >= k) {

				end = i;

				while (k < currsum && start < end) {
					currsum -= arr[start];
					++start;
				}

				if (currsum == k) {
					list.add(start + 1);
					list.add(end + 1);

					flag = true;
					break;
				}

			}
		}
		if (!flag) {
			list.add(-1);
		}

		System.out.println("Sub Array : ");

		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
