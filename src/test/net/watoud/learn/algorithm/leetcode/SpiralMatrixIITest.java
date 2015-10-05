/**
 * SpiralMatrixIITest.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class SpiralMatrixIITest
{
	@Test
	public void testGenerateMatrix()
	{
		SpiralMatrixII solution = new SpiralMatrixII();
		int[][] result = solution.generateMatrix(4);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4 }, result[0]);
		Assert.assertArrayEquals(new int[] { 12, 13, 14, 5 }, result[1]);
		Assert.assertArrayEquals(new int[] { 11, 16, 15, 6 }, result[2]);
		Assert.assertArrayEquals(new int[] { 10, 9, 8, 7 }, result[3]);
	}

	public void print(int[][] arr)
	{
		int length = arr.length;
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println("\n");
		}
	}
}
