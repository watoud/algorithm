package net.watoud.learn.algorithm.leetcode.lists;

public class InsertionSortList
{
	public ListNode insertionSortList(ListNode head)
	{
		if (head == null)
		{
			return null;
		}

		ListNode cur = head.next;
		head.next = null;
		while (cur != null)
		{
			ListNode tmp = head, pre = null;
			while (tmp != null && cur.val >= tmp.val)
			{
				pre = tmp;
				tmp = tmp.next;
			}

			if (pre == null)
			{
				ListNode zz = cur.next;
				cur.next = head;
				head = cur;
				cur = zz;
			}
			else
			{
				ListNode zz = cur.next;
				cur.next = pre.next;
				pre.next = cur;
				cur = zz;
			}
		}
		return head;
	}
}
