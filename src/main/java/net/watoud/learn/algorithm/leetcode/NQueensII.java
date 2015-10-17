/**
 * NQueensII.java
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
public class NQueensII
{
	public int totalNQueens(int n)
	{
		if (n <= 0)
		{
			return 0;
		}

		Stack<List<Integer>> s = new Stack<>();
		s.push(new ArrayList<Integer>());

		int count = 0;

		while (s.size() > 0)
		{
			List<Integer> top = s.pop();
			if (top.size() == n)
			{
				count++;
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

		return count;
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
}
