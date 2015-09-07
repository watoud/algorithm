/**
 * TwoSumTest.java
 * 2015年9月7日
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *         TODO 测试不够充分
 */
public class TwoSumTest
{
	@Test
	public void testTwosum()
	{
		TwoSum twosum = new TwoSum();
		int[] arr = new int[] { 23, 45, 9, 67, 32 };
		int[] result = twosum.twosumForce(arr, 41);
		Assert.assertArrayEquals(new int[] { 3, 5 }, result);

		arr = new int[] { 332, 45, -12, 67, 32 };
		result = twosum.twosumForce(arr, 77);
		Assert.assertArrayEquals(new int[] { 2, 5 }, result);
	}

	@Test
	public void testMerge()
	{
		TwoSum twosum = new TwoSum();
		int[] arr = new int[] { 23, 45, 9, 67, 32 };
		int[] indexes = new int[arr.length];
		for (int i = 0; i < indexes.length; i++)
		{
			indexes[i] = i;
		}

		twosum.merge(arr, 0, arr.length - 1, indexes);
		Assert.assertArrayEquals(new int[] { 9, 23, 32, 45, 67 }, arr);
		Assert.assertArrayEquals(new int[] { 2, 0, 4, 1, 3 }, indexes);
	}

	@Test
	public void testTwosumMerge()
	{
		TwoSum twosum = new TwoSum();
		int[] arr = new int[] { 23, 45, 9, 67, 32 };
		int[] result = twosum.twosumMerge(arr, 41);
		Assert.assertArrayEquals(new int[] { 3, 5 }, result);

		arr = new int[] { 332, 45, -12, 67, 32 };
		result = twosum.twosumMerge(arr, 77);
		Assert.assertArrayEquals(new int[] { 2, 5 }, result);
	}
}
