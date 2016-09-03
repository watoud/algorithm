package net.watoud.learn.algorithm.leetcode.Triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII
{
	public List<Integer> getRow(int rowIndex)
	{
		if (rowIndex < 0)
		{
			return new ArrayList<>();
		}

		List<Integer> result = new ArrayList<>();
		result.add(1);

		for (int i = 1; i <= rowIndex; i++)
		{
			getRowAux(result);
		}

		return result;
	}

	private void getRowAux(List<Integer> r)
	{
		r.add(1);
		for (int i = r.size() - 2; i > 0; i--)
		{
			r.set(i, r.get(i) + r.get(i - 1));
		}
	}

}
