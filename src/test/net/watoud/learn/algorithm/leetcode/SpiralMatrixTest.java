/**
 * SpiralMatrixTest.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class SpiralMatrixTest
{
	@Test
	public void testSpiralOrder()
	{
		SpiralMatrix solution = new SpiralMatrix();
		int[][] input = null;

		input = new int[][] {};
		Assert.assertArrayEquals(new Integer[] {},
		        solution.spiralOrder(input).toArray(new Integer[0]));

		input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		Assert.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 5, 4 }, solution.spiralOrder(input)
		        .toArray(new Integer[0]));

		input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Assert.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 },
		        solution.spiralOrder(input).toArray(new Integer[0]));

	}
}
