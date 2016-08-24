package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITest
{
	@Test
	public void testTwoSum()
	{
		TwoSumII sol = new TwoSumII();

		Assert.assertEquals(null, sol.twoSum(new int[] { 1 }, 1000));
		Assert.assertEquals(null, sol.twoSum(null, 1000));
		Assert.assertEquals(null, sol.twoSum(new int[] { 2, 7, 11, 15 }, 1000));

		Assert.assertArrayEquals(new int[] { 1, 2 }, //
		        sol.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		Assert.assertArrayEquals(new int[] { 1, 4 }, //
		        sol.twoSum(new int[] { 1, 3, 4, 6, 9 }, 7));
	}
}
