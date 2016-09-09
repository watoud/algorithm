package net.watoud.learn.algorithm.leetcode.strings;

import java.util.Set;

public class WordBreak
{
	public boolean wordBreak(String s, Set<String> wordDict)
	{
		if (s == null || s.length() == 0)
		{
			return true;
		}

		int maxLength = Integer.MIN_VALUE;
		for (String word : wordDict)
		{
			maxLength = Math.max(maxLength, word.length());
		}

		boolean[] ret = new boolean[s.length() + 1];
		ret[0] = true;

		for (int i = 1; i <= s.length(); i++)
		{
			for (int j = maxLength; j > 0; j--)
			{
				if (i - j < 0 || !ret[i - j])
				{
					continue;
				}

				if (wordDict.contains(s.substring(i - j, i)))
				{
					ret[i] = true;
					break;
				}
			}
		}

		return ret[s.length()];
	}

	// ºÄÊ±½Ï³¤
	public boolean wordBreak_recurence(String s, Set<String> wordDict)
	{
		if (s == null || s.length() == 0)
		{
			return true;
		}

		for (String word : wordDict)
		{
			if (s.startsWith(word) && wordBreak_recurence(s.substring(word.length()), wordDict))
			{
				return true;
			}
		}
		return false;
	}

}
