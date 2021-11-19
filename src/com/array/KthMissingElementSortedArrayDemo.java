package com.array;

public class KthMissingElementSortedArrayDemo {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 9, 10, 11, 12 };

		int k = 4;

		int kthElement = getKthElement(arr, k);

		System.out.println(kthElement);

	}

	private static int getKthElement(int[] arr, int k) {

		int n = arr.length;

		int l = 0, u = n - 1, mid;

		while (l <= u) {
			mid = (l + u) / 2;

			int num_less_than_mid = arr[mid] - (mid + 1);

			if (num_less_than_mid == k) {
				if (mid > 0 && (arr[mid - 1] - (mid)) == k) {
					u = mid - 1;
					continue;
				}

				// Else we return arr[mid] - 1.
				return arr[mid] - 1;
			}

			// Here we appropriately
			// narrow down the search window.
			if (num_less_than_mid < k) {
				l = mid + 1;
			} else if (k < num_less_than_mid) {
				u = mid - 1;
			}
		}
		if (u < 0)
			return k;

		// Else we find the residual count
		// of numbers which we'd then add to
		// arr[u] and get the missing kth number.
		int less = arr[u] - (u + 1);
		k -= less;

		// Return arr[u] + k
		return arr[u] + k;

	}
}
