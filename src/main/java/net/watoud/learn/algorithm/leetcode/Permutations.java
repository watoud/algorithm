/**
 * Permutations.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class Permutations
{
	public List<List<Integer>> permute(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<>();
		doPermute(nums, 0, result);
		return result;
	}

	private void doPermute(int[] nums, int level, List<List<Integer>> result)
	{
		if (level == nums.length - 1)
		{
			List<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < nums.length; i++)
			{
				tmp.add(nums[i]);
			}
			result.add(tmp);
			return;
		}

		for (int i = level; i < nums.length; i++)
		{
			swap(nums, level, i);
			doPermute(nums, level + 1, result);
			swap(nums, level, i);
		}
	}

	public void swap(int[] arr, int a, int b)
	{
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
