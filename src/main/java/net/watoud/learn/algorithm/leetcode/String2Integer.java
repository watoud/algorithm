/**
 * String2Integer.java
 * 2015��9��14��
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *	Implement atoi to convert a string to an integer.
	Hint: Carefully consider all possible input cases. 
	If you want a challenge, please do not see below and 
	ask yourself what are the possible input cases.
	
	leetcode�Ĳ���������
	Input:
			"  -0012a42"
	Expected:
			-12
			
	���ò�Ӧ����������Ľ�� 
 */
public class String2Integer
{
	public int myAtoi(String s)
	{
		if (s == null || s.isEmpty())
		{
			return 0;
		}
		s = s.trim();
		boolean positive = true;
		if (s.charAt(0) == '+')
		{
			positive = true;
			s = s.substring(1);
		}
		else if (s.charAt(0) == '-')
		{
			positive = false;
			s = s.substring(1);
		}

		int index = 0;
		while (index < s.length())
		{
			if (s.charAt(index) == '0')
			{
				index++;
			}
			else
			{
				break;
			}
		}

		if (index == s.length())
		{
			return 0;
		}
		else
		{
			s = s.substring(index);
		}

		if (s.isEmpty())
		{
			return 0;
		}

		int result = 0;
		int multi = 1;
		for (int i = s.length() - 1; i >= 0; i--)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				result = result + (s.charAt(i) - '0') * multi;
				multi = multi * 10;
				if (result < 0 || multi < 0)
				{
					if (!positive && result == Integer.MIN_VALUE && i == 0)
					{
						return Integer.MIN_VALUE;
					}
					return 0;
				}
			}
			else
			{
				return 0;
			}
		}

		if (!positive)
		{
			return -result;
		}
		else
		{
			return result;
		}
	}
}
