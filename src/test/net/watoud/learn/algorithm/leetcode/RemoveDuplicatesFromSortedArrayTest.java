/**
 * RemoveDuplicatesFromSortedArrayTest.java
 * 2015Äê9ÔÂ28ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class RemoveDuplicatesFromSortedArrayTest
{
	@Test
	public void testRemoveDuplicates()
	{
		RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

		int[] input = new int[] { 1 };

		input = new int[] { 1, 1 };
		int length = solution.removeDuplicates(input);
		Assert.assertEquals(1, length);
		Assert.assertEquals("1 ", print(input, length));

		input = new int[] { 1, 1, 2, 2, 3 };
		length = solution.removeDuplicates(input);
		Assert.assertEquals(3, length);
		Assert.assertEquals("1 2 3 ", print(input, length));

		input = new int[] { 1, 2, 3 };
		length = solution.removeDuplicates(input);
		Assert.assertEquals(3, length);
		Assert.assertEquals("1 2 3 ", print(input, length));

		input = new int[] { 1, 2, 2, 3 };
		length = solution.removeDuplicates(input);
		Assert.assertEquals(3, length);
		Assert.assertEquals("1 2 3 ", print(input, length));

		input = new int[] { 1, 2, 2, 3, 3 };
		length = solution.removeDuplicates(input);
		Assert.assertEquals(3, length);
		Assert.assertEquals("1 2 3 ", print(input, length));

	}

	public static String print(int[] arr, int length)
	{
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++)
		{
			builder.append(arr[i] + " ");
		}
		return builder.toString();
	}
}
