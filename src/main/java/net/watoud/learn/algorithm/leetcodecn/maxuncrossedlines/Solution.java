package net.watoud.learn.algorithm.leetcodecn.maxuncrossedlines;

public class Solution
{
	public int maxUncrossedLines(int[] A, int[] B)
	{
		int[][] c = new int[A.length + 1][B.length + 1];
		for (int i = 1; i <= A.length; i++)
		{
			for (int j = 1; j <= B.length; j++)
			{
				if (A[i - 1] == B[j - 1])
				{
					c[i][j] = c[i - 1][j - 1] + 1;
				}
				else
				{
					c[i][j] = Math.max(c[i][j - 1], c[i - 1][j]);
				}
			}
		}
		return c[A.length][B.length];
	}
}
