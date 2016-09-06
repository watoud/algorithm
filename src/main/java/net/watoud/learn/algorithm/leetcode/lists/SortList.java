package net.watoud.learn.algorithm.leetcode.lists;

public class SortList
{
	ListNode dummy = new ListNode(Integer.MIN_VALUE);

	public ListNode sortList(ListNode head)
	{
		return sortList(head, null);
	}

	private ListNode sortList(ListNode begin, ListNode end)
	{
		if (begin == end)
		{
			if (begin != null)
				begin.next = null;
			return begin;
		}

		// find middle node.
		ListNode slow = begin;
		ListNode fast = begin.next;
		while (fast != end && fast.next != end)
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		fast = slow.next;
		ListNode left = sortList(begin, slow);
		ListNode right = sortList(fast, end);

		// Merge lists
		begin = dummy;
		while (left != null && right != null)
		{
			if (right.val < left.val)
			{
				begin.next = right;
				right = right.next;
			}
			else
			{
				begin.next = left;
				left = left.next;
			}

			begin = begin.next;
			begin.next = null;
		}

		begin.next = left != null ? left : right;

		return dummy.next;
	}

}
