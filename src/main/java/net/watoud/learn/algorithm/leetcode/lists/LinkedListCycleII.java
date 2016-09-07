package net.watoud.learn.algorithm.leetcode.lists;

public class LinkedListCycleII
{
	public ListNode detectCycle(ListNode head)
	{
		if (head == null)
		{
			return null;
		}
		ListNode slow = head, fast = head.next;
		while (fast != null && fast.next != null && slow != fast)
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow != fast)
		{
			return null;
		}

		int c = 1;
		fast = fast.next;
		while (fast != slow)
		{
			fast = fast.next;
			c++;
		}

		ListNode target = head, pre = head;
		while (c > 0)
		{
			pre = pre.next;
			c--;
		}

		while (pre != target)
		{
			pre = pre.next;
			target = target.next;
		}

		return target;
	}
}
