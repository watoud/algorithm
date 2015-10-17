/**
 * NQueensNotRecursive.java
 * 2015Äê10ÔÂ18ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lixudong
 *
 */
public class NQueensNotRecursive
{
	public static void main(String[] args)
	{
		NQueensNotRecursive sol = new NQueensNotRecursive();

		List<List<String>> out = sol.solveNQueens(4);

		for (List<String> l : out)
		{
			for (String s : l)
			{
				System.out.println(s);
			}
			System.out.println("----------------------");
		}
		System.out.println(out.size());
	}

	public List<List<String>> solveNQueens(int n)
	{
		if (n <= 0)
		{
			return new ArrayList<>();
		}

		List<List<String>> result = new ArrayList<>();

		Stack<List<Integer>> s = new Stack<>();
		s.push(new ArrayList<Integer>());

		while (s.size() > 0)
		{
			List<Integer> top = s.pop();
			if (top.size() == n)
			{
				result.add(print(top));
			}

			for (int i = 1; i <= n; i++)
			{
				if (isOk(top, i))
				{
					List<Integer> tmp = new ArrayList<>(top);
					tmp.add(i);
					s.push(tmp);
				}
			}
		}

		return result;
	}

	private boolean isOk(List<Integer> top, int v)
	{
		int size = top.size();
		for (int i = 0; i < size; i++)
		{
			if (top.get(i) == v || (top.get(i) - v == size - i) || (v - top.get(i) == size - i))
			{
				return false;
			}
		}
		return true;
	}

	public List<String> print(List<Integer> in)
	{
		int n = in.size();
		List<String> result = new ArrayList<>();
		for (Integer v : in)
		{
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i <= n; i++)
			{
				if (v == i)
				{
					builder.append("Q");
				}
				else
				{
					builder.append(".");
				}
			}
			result.add(builder.toString());
		}
		return result;
	}
}
