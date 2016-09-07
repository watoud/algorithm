package net.watoud.learn.algorithm.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleIITest
{
	@Test
	public void testDetectCycle()
	{
		LinkedListCycleII sol = new LinkedListCycleII();
		ListNode head = new ListNode(10), //
		        f = new ListNode(11), //
		        s = new ListNode(13), //
		        t = new ListNode(14);

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = null;
		Assert.assertEquals(null, sol.detectCycle(head));
		Assert.assertEquals(null, sol.detectCycle(null));

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = s;
		Assert.assertEquals(s, sol.detectCycle(head));

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = t;
		Assert.assertEquals(t, sol.detectCycle(head));

		head.next = f;
		f.next = s;
		s.next = t;
		t.next = head;
		Assert.assertEquals(head, sol.detectCycle(head));
	}
}
