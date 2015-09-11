/**
 * LongestPalindromicSubstring.java
 * 2015Äê9ÔÂ11ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 *         Given a string S, find the longest palindromic substring in S. You
 *         may assume that the maximum length of S is 1000, and there exists one
 *         unique longest palindromic substring.
 */
public class LongestPalindromicSubstring
{
	public String longestPalindrome(String s)
	{
		if (s == null || s.isEmpty())
		{
			return null;
		}

		int begin = 0, end = 0, length = 0;
		for (int i = s.length() - 1; i >= 0; i--)
		{
			for (int j = 0; j <= i / 2; j++)
			{
				if (isPalindromic(s, j, i))
				{
					if (i - j + 1 > length)
					{
						length = i - j + 1;
						begin = j;
						end = i;
					}
					break;
				}
			}
		}
		return s.substring(begin, end + 1);
	}

	public boolean isPalindromic(String s, int begin, int end)
	{
		while (begin <= end)
		{
			if (s.charAt(begin) != s.charAt(end))
			{
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
}
