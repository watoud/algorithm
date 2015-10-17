/**
 * NQueens.java
 * 2015Äê10ÔÂ17ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class NQueensRecursive
{
	public static void main(String[] args)
	{
		NQueensRecursive sol = new NQueensRecursive();

		List<List<String>> out = sol.solveNQueens(7);

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
		int[] pos = new int[n];
		queenPos(result, pos, 0, n);
		return result;
	}

	public void queenPos(List<List<String>> out, int[] pos, int row, int n)
	{
		if (row == n)
		{
			List<String> l = new ArrayList<>();

			for (int i = 0; i < pos.length; i++)
			{
				StringBuilder b = new StringBuilder();
				for (int j = 1; j <= n; j++)
				{
					if (pos[i] != j)
					{
						b.append(".");
					}
					else
					{
						b.append("Q");
					}
				}
				l.add(b.toString());
			}

			out.add(l);
		}

		for (int i = 1; i <= n; i++)
		{
			if (isPosOk(pos, row, i))
			{
				pos[row] = i;
				queenPos(out, pos, row + 1, n);
			}
		}
	}

	public boolean isPosOk(int[] pos, int row, int v)
	{
		for (int i = 0; i < row; i++)
		{
			if (pos[i] == v || (pos[i] - v == i - row) || (pos[i] - v == row - i))
			{
				return false;
			}
		}

		return true;
	}
}
