/**
 * MergeTwoSortedListsTest.java
 * 2015Äê10ÔÂ9ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.lists.ListNode;
import net.watoud.learn.algorithm.leetcode.lists.ListNodeUtils;

/**
 * @author lixudong
 *
 */
public class MergeTwoSortedListsTest
{
	@Test
	public void testMergeTwoLists()
	{
		MergeTwoSortedLists solution = new MergeTwoSortedLists();
		ListNode l1 = null;
		ListNode l2 = null;
		ListNode result = null;

		l1 = ListNodeUtils.createFromArray(new int[] { 2 });
		l2 = ListNodeUtils.createFromArray(new int[] { 2 });
		result = solution.mergeTwoLists(l1, l2);
		Assert.assertEquals("2 2 ", ListNodeUtils.print(result));

		l1 = ListNodeUtils.createFromArray(new int[] { 2 });
		l2 = ListNodeUtils.createFromArray(new int[] { 1 });
		result = solution.mergeTwoLists(l1, l2);
		Assert.assertEquals("1 2 ", ListNodeUtils.print(result));

		l1 = ListNodeUtils.createFromArray(new int[] { 2 });
		l2 = ListNodeUtils.createFromArray(new int[] { 1, 5, 99, 123, 657 });
		result = solution.mergeTwoLists(l1, l2);
		Assert.assertEquals("1 2 5 99 123 657 ", ListNodeUtils.print(result));

		l2 = ListNodeUtils.createFromArray(new int[] { 1, 5, 99, 123, 657 });
		result = solution.mergeTwoLists(null, l2);
		Assert.assertEquals("1 5 99 123 657 ", ListNodeUtils.print(result));

		l1 = ListNodeUtils.createFromArray(new int[] { 2, 8, 67 });
		l2 = ListNodeUtils.createFromArray(new int[] { 1, 5, 99, 123, 657 });
		result = solution.mergeTwoLists(l1, l2);
		Assert.assertEquals("1 2 5 8 67 99 123 657 ", ListNodeUtils.print(result));
	}
}
