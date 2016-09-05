/**
 * SwapNodesinPairsTest.java
 * 2015Äê10ÔÂ12ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.lists.ListNodeUtils;

/**
 * @author lixudong
 *
 */
public class SwapNodesinPairsTest
{
	@Test
	public void testSwapPairs()
	{
		SwapNodesinPairs solution = new SwapNodesinPairs();

		Assert.assertEquals(
		        "2 1 4 3 7 ",
		        ListNodeUtils.print(solution.swapPairs(ListNodeUtils.createFromArray(new int[] { 1,
		                2, 3, 4, 7 }))));

		Assert.assertEquals(
		        "2 1 4 3 ",
		        ListNodeUtils.print(solution.swapPairs(ListNodeUtils.createFromArray(new int[] { 1,
		                2, 3, 4 }))));

		Assert.assertEquals(
		        "2 1 3 ",
		        ListNodeUtils.print(solution.swapPairs(ListNodeUtils.createFromArray(new int[] { 1,
		                2, 3 }))));

		Assert.assertEquals(
		        "2 1 ",
		        ListNodeUtils.print(solution.swapPairs(ListNodeUtils.createFromArray(new int[] { 1,
		                2 }))));

		Assert.assertEquals("1 ", ListNodeUtils.print(solution.swapPairs(ListNodeUtils
		        .createFromArray(new int[] { 1 }))));
		Assert.assertEquals(null, solution.swapPairs(null));
	}
}
