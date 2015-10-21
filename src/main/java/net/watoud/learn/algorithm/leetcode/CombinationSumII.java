/**
 * CombinationSumII.java
 * 2015��10��22��
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

		for (int i = start; i < candidates.length; i++)
		{
			if (i > 0 && candidates[i] == candidates[i - 1])
			{
				continue;
			}
			elements.add(candidates[i]);
			combinate(candidates, i + 1, target - candidates[i], elements, result);
			elements.remove(elements.size() - 1);
		}
	}
}
