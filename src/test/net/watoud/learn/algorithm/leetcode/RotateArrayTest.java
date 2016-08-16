package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest
{
	@Test
	public void testRotate()
	{
		RotateArray sol = new RotateArray();
		int[] dat = new int[] { 1, 2, 3 };
		sol.rotate(dat, 10);
		Assert.assertArrayEquals(new int[] { 3, 1, 2 }, dat);

		dat = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		sol.rotate(dat, 3);
		Assert.assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, dat);

		dat = new int[] {};
		sol.rotate(dat, 3);
		Assert.assertArrayEquals(new int[] {}, dat);

		dat = new int[] { 1, 2 };
		sol.rotate(dat, 1);
		Assert.assertArrayEquals(new int[] { 2, 1 }, dat);

		dat = new int[] { 1, 2, 3 };
		sol.rotate(dat, 2);
		Assert.assertArrayEquals(new int[] { 2, 3, 1 }, dat);
	}

}
