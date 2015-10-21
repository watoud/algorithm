/**
 * LongestCommonPrefix.java
 * 2015Äê10ÔÂ21ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 *
 *	Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix
{
	public String longestCommonPrefix(String[] strs)
	{
		if (strs == null || strs.length == 0)
		{
			return "";
		}

		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++)
		{
			if (strs[i] == null || strs[i].length() == 0)
			{
				return "";
			}
			minLength = Math.min(strs[i].length(), minLength);
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < minLength; i++)
		{
			for (int j = 1; j < strs.length; j++)
			{
				if (strs[j].charAt(i) != strs[0].charAt(i))
				{
					return builder.toString();
				}
			}
			builder.append(strs[0].charAt(i));
		}

		return builder.toString();
	}
}
