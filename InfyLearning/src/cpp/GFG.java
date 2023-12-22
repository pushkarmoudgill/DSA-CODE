package cpp;

//Java program to find maximum
//sum of hour glass in matrix
import java.io.*;

class GFG {
	
static int R = 5;
static int C = 5;

//Returns maximum sum of
//hour glass in ar[][]
static int findMaxSum(int [][]mat)
{
	if (R < 3 || C < 3){
		System.out.println("Not possible");
		System.exit(0);
	}

	// Here loop runs (R-2)*(C-2)
	// times considering different
	// top left cells of hour glasses.
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < R - 2; i++)
	{
		for (int j = 0; j < C - 2; j++)
		{
			// Considering mat[i][j] as top
			// left cell of hour glass.
			int sum = (mat[i][j] + mat[i][j + 1] +
					mat[i][j + 2]) + (mat[i + 1][j + 1]) +
					(mat[i + 2][j] + mat[i + 2][j + 1] +
					mat[i + 2][j + 2]);

			// If previous sum is less than
			// current sum then update
			// new sum in max_sum
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	// Driver code
	static public void main (String[] args)
	{
		int [][]mat = {{1, 1, 1, 0, 0, 0},
					{0, 1, 0, 0, 0, 0},
					{1, 1, 1, 0, 0, 0},
					{0 ,0 ,2 ,4 ,4 ,0},
					{0, 0, 0, 2, 0, 0},
					{0, 0, 1, 2, 4, 0}};
		int res = findMaxSum(mat);
		System.out.println("Maximum sum of hour glass = "+ res);
	}
	
}

//This code is contributed by vt_m .
//Code is modified by Susobhan Akhuli
