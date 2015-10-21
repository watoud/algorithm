/**
 * CombinationSum.java
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
public class CombinationSum
{
	public List<List<Integer>> combinationSum(int[] candidates, int target)
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

	private void combinate(int[] nums, int start, int target, List<Integer> elements,
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

		for (int i = start; i < nums.length; i++)
		{
			if (i >= 1 && nums[i] == nums[i - 1])
			{
				continue;
			}

			elements.add(nums[i]);
			combinate(nums, i, target - nums[i], elements, result);
			elements.remove(elements.size() - 1);
		}
	}
}
