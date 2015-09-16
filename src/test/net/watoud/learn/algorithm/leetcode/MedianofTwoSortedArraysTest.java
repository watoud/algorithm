/**
 * MedianofTwoSortedArraysTest.java
 * 2015Äê9ÔÂ16ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class MedianofTwoSortedArraysTest
{
	@Test
	public void testFindMedianSortedArrays()
	{
		MedianofTwoSortedArrays solution = new MedianofTwoSortedArrays();

		Assert.assertEquals(0, solution.findMedianSortedArrays(null, null), 0.00001d);
		Assert.assertEquals(2, solution.findMedianSortedArrays(null, new int[] { 1, 2, 3 }),
		        0.00001d);
		Assert.assertEquals(2.5, solution.findMedianSortedArrays(null, new int[] { 1, 2, 3, 4 }),
		        0.00001d);
		Assert.assertEquals(3, solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5 }, null),
		        0.00001d);
		Assert.assertEquals(3.5,
		        solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5, 6 }, null), 0.00001d);

		Assert.assertEquals(3, solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5, 6 },
		        new int[] { 1, 2, 3 }), 0.00001d);

		Assert.assertEquals(
		        3,
		        solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 1, 2,
		                3, 4 }), 0.00001d);
	}
}
