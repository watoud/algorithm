package net.watoud.learn.algorithm.leetcode.tree;

public class UniqueBinarySearchTrees
{
	public static int numTrees(int n)
	{
		if (n <= 0)
		{
			return 0;
		}

		int[] ret = new int[n + 1];
		ret[0] = 1;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i - 1; j++)
			{
				ret[i] += ret[j] * ret[i - 1 - j];
			}
			ret[i] += ret[i - 1];
		}

		return ret[n];
	}
}
