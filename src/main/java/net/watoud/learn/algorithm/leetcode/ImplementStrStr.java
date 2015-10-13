/**
 * ImplementStrStr.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class ImplementStrStr
{
	public int strStr(String haystack, String needle)
	{

		if (haystack == null || needle == null)
		{
			return -1;
		}

		if (needle.length() > haystack.length())
		{
			return -1;
		}

		if (needle.length() == 0)
		{
			return 0;
		}

		for (int i = 0; i < haystack.length(); i++)
		{
			if (i + needle.length() > haystack.length())
			{
				return -1;
			}
			if (haystack.charAt(i) != needle.charAt(0))
			{
				continue;
			}

			int j = 0;
			for (; j < needle.length(); j++)
			{
				if (haystack.charAt(i + j) != needle.charAt(j))
				{
					break;
				}
			}

			if (j == needle.length())
			{
				return i;
			}
		}
		return -1;
	}
}
