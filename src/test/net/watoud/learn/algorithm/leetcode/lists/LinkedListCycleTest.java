package net.watoud.learn.algorithm.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest
{
	@Test
	public void testHasCycle()
	{
		LinkedListCycle sol = new LinkedListCycle();
		ListNode head = new ListNode(10), //
		        f = new ListNode(11), //
		        s = new ListNode(13), //
		        t = new ListNode(14);

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = s;
		Assert.assertTrue(sol.hasCycle(head));

		Assert.assertFalse(sol.hasCycle(null));
		Assert.assertFalse(sol.hasCycle(new ListNode(11)));

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = null;
		Assert.assertFalse(sol.hasCycle(head));
	}
}
