package net.watoud.learn.algorithm.leetcode.lists;

public class LinkedListCycle
{
	public boolean hasCycle(ListNode head)
	{
		if (head == null)
		{
			return false;
		}
		ListNode slow = head, fast = head.next;
		while (fast != null && fast.next != null && slow != fast)
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow == fast;
	}
}
