package net.watoud.learn.algorithm.leetcode.strings;

public class InterleavingString
{
	/*
	 * For example,Given: s1 = "aabcc", s2 = "dbbca",
	 * 
	 * When s3 = "aadbbcbcac", return true. When s3 = "aadbbbaccc", return
	 * false.
	 */
	public boolean isInterleave(String s1, String s2, String s3)
	{
		if (s1 == null && s2 == null && s3 == null)
		{
			return true;
		}

		if (s1 == null)
		{
			return s2 == null ? false : s2.equals(s3);
		}

		if (s2 == null)
		{
			return s1 == null ? false : s1.equals(s3);
		}

		if (s3 == null)
		{
			return false;
		}

		if (s1.length() + s2.length() != s3.length())
		{
			return false;
		}

		boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
		dp[0][0] = true;

		for (int i = 1; i <= s1.length(); i++)
		{
			dp[i][0] = dp[i - 1][0] && (s1.charAt(i - 1) == s3.charAt(i - 1));
		}

		for (int i = 1; i <= s2.length(); i++)
		{
			dp[0][i] = dp[0][i - 1] && (s2.charAt(i - 1) == s3.charAt(i - 1));
		}

		for (int i = 1; i <= s1.length(); i++)
		{
			for (int j = 1; j <= s2.length(); j++)
			{
				boolean ud = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1));
				boolean lr = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1));

				dp[i][j] = ud || lr;
			}
		}

		return dp[s1.length()][s2.length()];
	}
}
