/**
 * LongestSubstringWithoutRepeating.java
 * 2015年9月9日
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 * 
 *         Given a string, find the length of the longest substring without
 *         repeating characters. For example, the longest substring without
 *         repeating letters for "abcabcbb" is "abc", which the length is 3. For
 *         "bbbbb" the longest substring is "b", with the length of 1.
 * 
 *         并没有说不区分大小写
 */
public class LongestSubstringWithoutRepeating
{

	public int lengthOfLongestSubstring(String s)
	{
		if (s == null)
		{
			return 0;
		}
		int[] flags = new int[52];
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (flags[getIndex(s.charAt(i))] != 0)
			{
				return maxLength;
			}
			else
			{
				flags[getIndex(s.charAt(i))]++;
				maxLength++;
			}
		}
		return maxLength;
	}

	public int getIndex(char ch)
	{
		if (Character.isUpperCase(ch))
		{
			return ch - 'A' + 26;
		}
		else if (Character.isLowerCase(ch))
		{
			return ch - 'a';
		}
		else
		{
			throw new IllegalArgumentException("Char [" + ch + "] is not a letter.");
		}
	}
}
