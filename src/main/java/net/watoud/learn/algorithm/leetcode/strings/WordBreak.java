package net.watoud.learn.algorithm.leetcode.strings;

import java.util.Set;

public class WordBreak
{
	// ºÄÊ±½Ï³¤
	public boolean wordBreak(String s, Set<String> wordDict)
	{
		if (s == null || s.length() == 0)
		{
			return true;
		}

		for (String word : wordDict)
		{
			if (s.startsWith(word) && wordBreak(s.substring(word.length()), wordDict))
			{
				return true;
			}
		}
		return false;
	}
}
