/**
 * GenerateParentheses2.java
 * 2015Äê9ÔÂ28ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class GenerateParentheses2
{
	public List<String> generateParenthesis(int n)
	{
		if (n <= 0)
		{
			return new ArrayList<String>();
		}

		List<String> result = new ArrayList<String>();

		char[] arr = new char[2 * n];

		generate(arr, 0, result);
		return result;
	}

	/**
	 * @param arr
	 * @param i
	 * @param result
	 */
	private void generate(char[] arr, int level, List<String> result)
	{

		int sum = 0;
		for (int i = 0; i < level; i++)
		{
			if (arr[i] == '(')
			{
				sum += 1;
			}
			else
			{
				sum -= 1;
			}
			if (sum < 0)
			{
				return;
			}
		}

		if (level != arr.length)
		{
			arr[level] = '(';
			generate(arr, level + 1, result);
			arr[level] = ')';
			generate(arr, level + 1, result);
		}
		else
		{
			sum = 0;
			for (int i = 0; i < level; i++)
			{
				if (arr[i] == '(')
				{
					sum += 1;
				}
				else
				{
					sum -= 1;
				}
			}

			if (sum != 0)
			{
				return;
			}

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < arr.length; i++)
			{
				builder.append(arr[i]);
			}
			result.add(builder.toString());
		}
	}
}
