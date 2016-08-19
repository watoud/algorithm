package net.watoud.learn.algorithm.leetcode.factorial;

public class FactorialTrailingZeroes
{
	public int trailingZeroes(int n)
	{
		if (n < 5)
		{
			return 0;
		}
		long count = 0, base = 5, tmp = 0;

		while ((tmp = n / base) >= 1)
		{
			count += tmp;
			base *= 5;
		}

		return (int) count;
	}
}
