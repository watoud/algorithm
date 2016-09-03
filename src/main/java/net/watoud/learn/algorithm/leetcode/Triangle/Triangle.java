package net.watoud.learn.algorithm.leetcode.Triangle;

import java.util.List;

/**
 * [
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
 *
 */
public class Triangle
{
	public int minimumTotal(List<List<Integer>> triangle)
	{
		if (triangle == null || triangle.size() == 0)
		{
			return 0;
		}

		int level = triangle.size();
		int[][] dp = new int[level][];
		dp[0] = new int[1];
		dp[0][0] = triangle.get(0).get(0);

		for (int i = 1; i < level; i++)
		{
			List<Integer> zz = triangle.get(i);
			dp[i] = new int[zz.size()];
			for (int j = 0; j < zz.size(); j++)
			{
				int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
				if (j - 1 >= 0)
				{
					a = dp[i - 1][j - 1] + zz.get(j);
				}

				if (j < dp[i - 1].length)
				{
					b = dp[i - 1][j] + zz.get(j);
				}

				dp[i][j] = Math.min(a, b);
			}
		}

		int result = Integer.MAX_VALUE;
		int len = triangle.get(level - 1).size();
		for (int i = 0; i < len; i++)
		{
			if (dp[len - 1][i] < result)
			{
				result = dp[len - 1][i];
			}
		}

		return result;
	}
}
