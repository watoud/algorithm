/**
 * CombinationSumII.java
 * 2015Äê10ÔÂ22ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class CombinationSumII
{
	public List<List<Integer>> combinationSum2(int[] candidates, int target)
	{
		if (candidates == null || candidates.length == 0 || target <= 0)
		{
			return new ArrayList<>();
		}

		Arrays.sort(candidates);

		List<List<Integer>> result = new ArrayList<>();
		combinate(candidates, 0, target, new ArrayList<Integer>(), result);
		return result;
	}

	private void combinate(int[] candidates, int start, int target, ArrayList<Integer> elements,
	        List<List<Integer>> result)
	{
		if (target < 0)
		{
			return;
		}

		if (target == 0)
		{
			result.add(new ArrayList<Integer>(elements));
			return;
		}

		int index = start;
		while (index < candidates.length)
		{
			int tmp = index + 1;
			while (tmp < candidates.length && candidates[tmp] == candidates[tmp - 1])
			{
				tmp++;
			}

			int count = tmp - index, sum = 0;

			for (int c = 0; c < count; c++)
			{
				elements.add(candidates[index + c]);
				sum += candidates[index + c];
				combinate(candidates, tmp, target - sum, elements, result);
			}

			for (int i = 0; i < count; i++)
			{
				elements.remove(elements.size() - 1);
			}

			index = tmp;
		}
	}
}
