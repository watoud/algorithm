package net.watoud.learn.algorithm.leetcode.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle
{
	public List<List<Integer>> generate(int numRows)
	{
		if (numRows <= 0)
		{
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();

		// 第一行
		result.add(Arrays.asList(new Integer[] { 1 }));

		// 第二个 到第n行
		for (int i = 2; i <= numRows; i++)
		{
			List<Integer> cur = new ArrayList<>();
			// 第一个
			cur.add(1);
			// 第2到第i-1个
			List<Integer> last = result.get(i - 2);
			for (int j = 2; j <= i - 1; j++)
			{
				cur.add(last.get(j - 2) + last.get(j - 1));
			}
			// 第i个
			cur.add(1);
			result.add(cur);
		}

		return result;
	}
}
