/**
 * Pow.java
 * 2015Äê10ÔÂ7ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class Pow
{
	public double myPow(double x, int n)
	{
		if (x == 0 && n == 0)
		{
			return Double.NaN;
		}
		else if (n == 0)
		{
			return 1;
		}

		if (x == 1d)
		{
			return 1d;
		}

		if (x == -1d)
		{
			if (n % 2 == 0)
			{
				return 1d;
			}
			else
			{
				return -1d;
			}
		}

		if (n < 0)
		{
			return posivivePow(1 / x, Math.abs(n));
		}
		else
		{
			return posivivePow(x, n);
		}
	}

	public double posivivePow(double x, int n)
	{
		double result = 1;
		while (n > 0)
		{
			if (Math.abs(result) < Double.MIN_NORMAL)
			{
				return 0d;
			}

			if (Math.abs(result) > Double.MAX_VALUE)
			{
				if (x < 0 && n % 2 == 1)
				{
					return Double.NEGATIVE_INFINITY;
				}
				else
				{
					return Double.POSITIVE_INFINITY;
				}
			}
			result *= x;
			n--;
		}
		return result;
	}
}
