/**
 * PalindromeNumber.java
 * 2015年9月15日
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *	Determine whether an integer is a palindrome. Do this without extra space.
 *
 *	需要考虑溢出问题
 */
public class PalindromeNumber
{
	public boolean isPalindrome1(int x)
	{
		if (x < 0)
		{
			return false;
		}

		String value = String.valueOf(x);
		int begin = 0, end = value.length() - 1;

		while (begin <= end)
		{
			if (value.charAt(begin) != value.charAt(end))
			{
				return false;
			}
			begin++;
			end--;
		}

		return true;
	}

	public boolean isPalindrome2(int x)
	{
		if (x < 0)
			return false;

		// initialize how many zeros
		int div = 1;
		while (x / div >= 10)
		{
			div *= 10;
		}

		while (x != 0)
		{
			int left = x / div;
			int right = x % 10;

			if (left != right)
				return false;

			x = (x % div) / 10;
			div /= 100;
		}

		return true;
	}

	public int targetBitValue(int x, int bit)
	{
		int reminder = -1;

		while (bit > 0)
		{
			reminder = x % 10;
			x = x / 10;
			bit--;
		}
		return reminder;
	}
}
