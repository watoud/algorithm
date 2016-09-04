package net.watoud.learn.algorithm.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.ListNode;
import net.watoud.learn.algorithm.leetcode.ListUtils;

public class ReorderListTest
{
	@Test
	public void testReorderList()
	{
		ReorderList sol = new ReorderList();

		ListNode head = ListUtils.create4Array(new int[] { 1, 2, 3 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1, 3, 2 }, ListUtils.toArray(head, 3));

		head = ListUtils.create4Array(new int[] { 1, 2, 3, 4, 5 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1, 5, 2, 4, 3 }, ListUtils.toArray(head, 5));

		head = ListUtils.create4Array(new int[] { 1, 2, 3, 4, 5, 6 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1, 6, 2, 5, 3, 4 }, ListUtils.toArray(head, 6));

		head = ListUtils.create4Array(new int[] { 1, 2, 3, 4 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1, 4, 2, 3 }, ListUtils.toArray(head, 4));

		head = ListUtils.create4Array(new int[] { 1, 2 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1, 2 }, ListUtils.toArray(head, 2));

		head = ListUtils.create4Array(new int[] { 1 });
		sol.reorderList(head);
		Assert.assertArrayEquals(new int[] { 1 }, ListUtils.toArray(head, 1));

		head = ListUtils.create4Array(new int[] {});
		sol.reorderList(head);
		Assert.assertNull(head);
	}
}
