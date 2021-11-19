package matrix;

public class MaxDiffOfTSumofElemOfRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][] = {{-1, 2, 3, 4},
                {5, 3, -2, 1},
                {6, 7, 2, -3},
                {2, 9, 1, 4},
                {2, 1, -2, 0}};
		int m = 5, n = 4;

		int result = getMaxRowDiff(matrix, m, n);
		System.out.println("Max Diff : " + result);
	}

	private static int getMaxRowDiff(int[][] matrix, int m, int n) {

		int rowSum[] = new int[m];

		int k = 0;
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				rowSum[k] = rowSum[k] + matrix[i][j];
			}
			k++;
		}
		
		System.out.print("Row sum : ");
		for (int i = 0; i < m; i++) {
			System.out.print(rowSum[i] + " , ");
		}
		System.out.println();
		/*int max_diff = rowSum[1] - rowSum[0];
		int min_diff = rowSum[0];

		for (int i = 0; i < m - 1; i++) {
			if (rowSum[i+1] - rowSum[i ] > max_diff) {
				max_diff = rowSum[i+1] - rowSum[i ];
			}
		}*/

		
		// calculating maximum difference of two elements
	    // such that rowSum[i]<rowsum[j]
	    int max_diff = rowSum[1] - rowSum[0];
	    int min_element = rowSum[0];
	    for (int i = 1; i < m; i++) {
	 
	    // if current difference is greater than
	    // previous then update it
	    if (rowSum[i] - min_element > max_diff)
	        max_diff = rowSum[i] - min_element;
	 
	    // if new element is less than previous
	    // minimum element then update it so that
	    // we may get maximum difference in remaining array
	    if (rowSum[i] < min_element)
	        min_element = rowSum[i];
	    }
		return max_diff;
	}

}
