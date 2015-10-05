/**
 * LongestSubstringWithoutRepeating.java
 * 2015��9��9��
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
 *         �Ƚϵ�ʱ��ǰ��ıȽϽ������Ϊ����ıȽ���ʹ��
 *         ���磬1abcdbew��������b�ظ�֮�󣬿��Դ�c��ʼ����b���бȽϣ�
 * 
 */
public class LongestSubstringWithoutRepeating
{

	public int lengthOfLongestSubstring(String s)
	{
		if (s == null || s.isEmpty())
		{
			return 0;
		}

		int base1 = 0, base2 = 1, maxLength = 1;

		lable: while (base1 < s.length() && base2 < s.length())
		{
			int i = base1;
			for (; i < s.length() && i < base2; i++)
			{
				if (s.charAt(i) == s.charAt(base2))
				{
					maxLength = Math.max(maxLength, base2 - base1);
					base1 = i + 1;
					if (base2 <= base1)
					{
						base2++;
					}
					continue lable;
				}
			}
			base2++;
		}

		return Math.max(maxLength, base2 - base1);
	}
}
