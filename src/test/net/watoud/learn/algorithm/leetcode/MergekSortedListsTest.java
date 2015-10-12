/**
 * MergekSortedListsTest.java
 * 2015Äê10ÔÂ12ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class MergekSortedListsTest
{
	@Test
	public void testMergeKLists()
	{
		MergekSortedLists solution = new MergekSortedLists();

		ListNode in1 = ListNodeUtils.createFromArray(new int[] { 1, 34, 56, 88 });
		ListNode in2 = ListNodeUtils.createFromArray(new int[] { 3, 50, 99 });
		ListNode in3 = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		Assert.assertEquals(
		        "1 3 3 6 9 34 50 56 88 99 ",
		        ListNodeUtils.print(solution.mergeKLists(new ListNode[] { null, in1, in2, null,
		                in3, null })));

		ListNode input13 = ListNodeUtils.createFromArray(new int[] { 1, 34, 56, 88 });
		ListNode input11 = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		ListNode input12 = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		Assert.assertEquals("1 3 3 6 6 9 9 34 56 88 ", ListNodeUtils.print(solution
		        .mergeKLists(new ListNode[] { input11, input12, input13 })));

		ListNode input1 = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		ListNode input2 = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		Assert.assertEquals("3 3 6 6 9 9 ",
		        ListNodeUtils.print(solution.mergeKLists(new ListNode[] { input1, input2 })));

		ListNode input = ListNodeUtils.createFromArray(new int[] { 3, 6, 9 });
		Assert.assertEquals("3 6 9 ",
		        ListNodeUtils.print(solution.mergeKLists(new ListNode[] { input })));
		Assert.assertEquals(null, solution.mergeKLists(null));
	}
}
