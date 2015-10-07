/**
 * LongestPalindromicSubstring.java
 * 2015��9��11��
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 *         Given a string S, find the longest palindromic substring in S. You
 *         may assume that the maximum length of S is 1000, and there exists one
 *         unique longest palindromic substring.
 * 
 *         c12321ab���Կ����ǣ���ǰ��ֱ�ͬʱȥ��һ���ַ���һֱ��ǰ����ߺ��浽��12321�ı߽��ַ���
 *         c12321ab->12321a
 *         ���ң�������ĵ�ʱ�򣬴�����ַ�����ʼ�����Խ�ʡ���ٲ���
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
		int index1 = 0, index2 = 0;

		for (int i = s.length() - 1; i >= 0; i--)
		{
			int begin = 0, end = i;
			index1 = begin;
			index2 = end;
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
			index1 = begin;
			index2 = end;
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
				maxBase1 = index1;
				maxBase2 = index2;
			}

			if (index2 == s.length() - 1)
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
