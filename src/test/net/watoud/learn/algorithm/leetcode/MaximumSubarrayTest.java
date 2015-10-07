/**
 * MaximumSubarrayTest.java
 * 2015年10月7日
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class MaximumSubarrayTest
{
	@Test
	public void testMaxSubArray()
	{
		MaximumSubarray solution = new MaximumSubarray();

		Assert.assertEquals(18, solution.maxSubArray(new int[] { -2, 1, 8, 9, -56, 9 }));
		Assert.assertEquals(1, solution.maxSubArray(new int[] { -2, 1 }));
		Assert.assertEquals(1, solution.maxSubArray(new int[] { 1 }));
		Assert.assertEquals(-2, solution.maxSubArray(new int[] { -2 }));
		Assert.assertEquals(6, solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
