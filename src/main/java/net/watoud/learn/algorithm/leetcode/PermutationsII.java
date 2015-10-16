/**
 * PermutationsII.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class PermutationsII
{
	public List<List<Integer>> permuteUnique(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return new ArrayList<>();
		}

		List<Integer> first = new ArrayList<>();
		for (int i = 0; i < nums.length; i++)
		{
			first.add(Integer.valueOf(nums[i]));
		}

		if (nums.length < 2)
		{
			return Arrays.asList(first);
		}

		List<List<Integer>> result = new ArrayList<>();
		result.add(first);
		int pos = 0;
		while (pos < nums.length - 1)
		{
			int size = result.size();
			for (int i = 0; i < size; i++)
			{
				for (int j = pos + 1; j < nums.length; j++)
				{
					List<Integer> cur = new ArrayList<>(result.get(i));
					if (cur.get(pos) != cur.get(j))
					{
						swap(cur, pos, j);
						result.add(cur);
					}
				}
			}
			pos++;
		}

		return result;
	}

	public void swap(List<Integer> list, int a, int b)
	{
		int tmp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, tmp);
	}
}
