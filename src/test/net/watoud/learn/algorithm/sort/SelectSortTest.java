/**
 * SelectSortTest.java
 * 2015Äê9ÔÂ8ÈÕ
 */
package net.watoud.learn.algorithm.sort;

import net.watoud.learn.algorithm.sort.SelectSort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class SelectSortTest
{
	@Test
	public void testSort()
	{
		SelectSort sorter = new SelectSort();
		int[] arr = new int[] { 1, 2 };
		sorter.sort(arr);
		Assert.assertArrayEquals(new int[] { 1, 2 }, arr);

		arr = new int[] { 2, 1 };
		sorter.sort(arr);
		Assert.assertArrayEquals(new int[] { 1, 2 }, arr);

		arr = new int[] { Integer.MAX_VALUE, 434, 2, 44, 1, 99 };
		sorter.sort(arr);
		Assert.assertArrayEquals(new int[] { 1, 2, 44, 99, 434, Integer.MAX_VALUE }, arr);

		arr = new int[] { 1, 2, 44, 99, 434, Integer.MAX_VALUE };
		sorter.sort(arr);
		Assert.assertArrayEquals(new int[] { 1, 2, 44, 99, 434, Integer.MAX_VALUE }, arr);

		arr = new int[] { Integer.MAX_VALUE, 434, 99, 44, 2, 1 };
		sorter.sort(arr);
		Assert.assertArrayEquals(new int[] { 1, 2, 44, 99, 434, Integer.MAX_VALUE }, arr);
	}
}
