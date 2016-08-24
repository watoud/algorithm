package net.watoud.learn.algorithm.leetcode;

public class TwoSumII
{
	public int[] twoSum(int[] numbers, int target)
	{
		if (numbers == null || numbers.length < 2)
		{
			return null;
		}

		int f = 0, r = numbers.length - 1;

		while (f < r)
		{
			if (numbers[r] + numbers[f] == target)
			{
				return new int[] { f + 1, r + 1 };
			}
			else if (numbers[r] + numbers[f] > target)
			{
				r--;
			}
			else
			{
				f++;
			}

		}
		return null;
	}
}
