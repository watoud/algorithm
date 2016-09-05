/**
 * CombinationSumTest.java
 * 2015Äê10ÔÂ22ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.List;

import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.lists.ListUtils;

/**
 * @author lixudong
 *
 */
public class CombinationSumTest
{
	@Test
	public void testCombinationSum()
	{
		CombinationSum sol = new CombinationSum();
		List<List<Integer>> result = null;

		result = sol.combinationSum(new int[] { 2, 3, 6, 1, 1 }, 7);
		ListUtils.print(result);

		System.out.println("--------------------------------");
		result = sol.combinationSum(new int[] { 2, 3, 6, 7 }, 7);
		ListUtils.print(result);
	}
}
