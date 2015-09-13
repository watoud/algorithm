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
		int maxLength = 0;
		int maxIndex1 = 0, maxIndex2 = 0, maxBase1 = 0, maxBase2 = 0;

		for (int i = s.length() - 1; i >= 0; i--)
		{
			int begin = 0, end = i;
			int index1 = begin, index2 = end;
			while (begin <= end)
			{
				if (s.charAt(begin) != s.charAt(end))
				{
					index1 = begin + 1;
					index2 = end - 1;
				}
				end--;
				begin++;
			}

			if (maxLength < index2 - index1 + 1)
			{
				maxLength = index2 - index1 + 1;
				maxIndex1 = index1;
				maxIndex2 = index2;
			}

			if (index1 == 0)
			{
				break;
			}
		}

		for (int i = 0; i < s.length(); i++)
		{
			int begin = i, end = s.length() - 1;
			int base1 = begin, base2 = end;
			while (begin <= end)
			{
				if (s.charAt(begin) != s.charAt(end))
				{
					base1 = begin + 1;
					base2 = end - 1;
				}
				end--;
				begin++;
			}

			if (maxLength < base2 - base1 + 1)
			{
				maxLength = base2 - base1 + 1;
				maxBase1 = base1;
				maxBase2 = base2;
			}

			if (base2 == s.length() - 1)
			{
				break;
			}
		}

		if (maxBase2 - maxBase1 > maxIndex2 - maxIndex1)
		{

			return s.substring(maxBase1, maxBase2 + 1);
		}
		else
		{
			return s.substring(maxIndex1, maxIndex2 + 1);
		}
	}
}
