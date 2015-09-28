/**
 * RemoveElementTest.java
 * 2015Äê9ÔÂ28ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class RemoveElementTest
{
	@Test
	public void testRemoveElement()
	{
		RemoveElement solution = new RemoveElement();

		int[] input = new int[] { 1 };
		int length = solution.removeElement(input, 1);
		Assert.assertEquals(0, length);

		input = new int[] { 1, 3, 4, 4, 5, 4, 4 };
		length = solution.removeElement(input, 4);
		Assert.assertEquals(3, length);

		input = new int[] { 4, 1, 3, 4, 4 };
		length = solution.removeElement(input, 4);
		Assert.assertEquals(2, length);
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
