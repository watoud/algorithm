package net.watoud.learn.algorithm.leetcode.strings;

public class DistinctSubsequences
{
	public int numDistinct(String s, String t)
	{
		if (t == null)
		{
			return 1;
		}

		if (s == null)
		{
			return 0;
		}
		if (s.length() < t.length())
		{
			return 0;
		}

		int[] ret = new int[1];
		numDistinctAux(s, 0, t, 0, ret);
		return ret[0];
	}

	private void numDistinctAux(String s, int is, String t, int it, int[] ret)
	{
		if (it == t.length())
		{
			ret[0]++;
			return;
		}

		for (int i = is; i < s.length(); i++)
		{
			if (s.charAt(i) == t.charAt(it))
			{
				numDistinctAux(s, i + 1, t, it + 1, ret);
			}
		}
	}
}
