package net.watoud.learn.algorithm.leetcode;

public class ReverseBits
{
	public int reverseBits(int n)
	{

		int ret = n;
		int l = 0, r = 31;

		while (l < r)
		{
			boolean lv = (n & (1 << l)) != 0;
			boolean rv = (n & (1 << r)) != 0;

			if (lv && !rv)
			{
				ret = ret | (1 << r);
				ret = ret & 0b11111111_11111111_11111111_11111111 - powOf2(l);
			}
			if (!lv && rv)
			{
				ret = ret | (1 << l);
				ret = ret & 0b11111111_11111111_11111111_11111111 - powOf2(r);
			}

			l++;
			r--;

		}
		return ret;
	}

	private int powOf2(int n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			return 2 * powOf2(n - 1);
		}
	}

}
