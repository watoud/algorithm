/**
 * CombinationSumIITest.java
 * 2015��10��22��
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.lists.ListUtils;

/**
 * @author lixudong
 *
 */
public class CombinationSumIITest
{
	@Test
	public void testCombinationSum2()
	{
		CombinationSumII sol = new CombinationSumII();

		ListUtils.print(sol.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8));
	}
}
