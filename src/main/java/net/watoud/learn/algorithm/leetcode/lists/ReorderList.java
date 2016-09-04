package net.watoud.learn.algorithm.leetcode.lists;

import net.watoud.learn.algorithm.leetcode.ListNode;

public class ReorderList
{
	public void reorderList(ListNode head)
	{
		if (head == null)
		{
			return;
		}

		// 找到中间的一个节点m
		ListNode f = head, f2 = head.next;
		if (f2 == null)
		{
			return;
		}
		while (f != null && f2 != null)
		{
			f2 = f2.next;
			if (f2 != null)
			{
				f2 = f2.next;
			}

			if (f2 == null)
			{
				break;
			}

			f = f.next;
		}
		ListNode m = f.next;
		f.next = null;

		// 把中间节点m以及之后的翻转 
		ListNode next = null, cur = m.next;
		m.next = null;
		while (cur != null)
		{
			next = cur.next;
			cur.next = m;
			m = cur;
			cur = next;
		}

		// reorder 
		ListNode a = head, b = m, au = null, bu = null;
		while (a != null && b != null)
		{
			au = a;
			bu = b;
			a = a.next;
			b = b.next;
			au.next = bu;
			bu.next = a;
		}

		if (b != null)
		{
			au.next.next = b;
		}
	}
}
