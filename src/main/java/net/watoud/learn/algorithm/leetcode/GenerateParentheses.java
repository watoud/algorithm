/**
 * GenerateParentheses.java
 * 2015年9月27日
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lixudong
 *
 */
public class GenerateParentheses
{
//超时
	public List<String> generateParenthesis(int n)
	{
		Set<String> result = new HashSet<String>();

		if (n <= 0)
		{
			return new ArrayList<String>();
		}

		char[] parentheses = new char[2 * n];
		for (int i = 0; i < n; i++)
		{
			parentheses[i * 2] = '(';
			parentheses[i * 2 + 1] = ')';
		}

		generatre(parentheses, 1, result);

		return new ArrayList<String>(result);
	}

	/**
	 * @param parentheses
	 * @param i
	 * @param result
	 */
	private void generatre(char[] parentheses, int level, Set<String> result)
	{
		int sum = 0;
		for (int i = 0; i < level - 1; i++)
		{
			if (parentheses[i] == '(')
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

		if (level != parentheses.length)
		{
			for (int i = level - 1; i < parentheses.length; i++)
			{
				swap(parentheses, level - 1, i);
				generatre(parentheses, level + 1, result);
				swap(parentheses, level - 1, i);
			}
		}
		else
		{
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < parentheses.length; i++)
			{
				builder.append(parentheses[i]);
			}

			result.add(builder.toString());
		}
	}

	public void swap(char[] arr, int i, int j)
	{
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
