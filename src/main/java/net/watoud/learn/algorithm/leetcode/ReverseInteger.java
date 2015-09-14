/**
 * ReverseInteger.java
 * 2015��9��14��
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *	Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	
	�ӿڹ��ڼ򵥣��޷������쳣�����
 */
public class ReverseInteger
{
	public int reverse(int x)
	{
		if (x == 0)
		{
			return 0;
		}

		boolean positive = true;
		if (x < 0)
		{
			positive = false;
		}

		StringBuilder builder = new StringBuilder();
		while (x / 10 != 0)
		{
			builder.append(Math.abs(x % 10));
			x = x / 10;
		}
		builder.append(Math.abs(x));

		//
		try
		{
			int result = Integer.valueOf(builder.toString());
			if (!positive)
			{
				return -result;
			}
			else
			{
				return result;
			}
		}
		catch (Exception e)
		{
			return 0;
		}

	}
}
