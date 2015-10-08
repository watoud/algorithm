/**
 * MergeTwoSortedLists.java
 * 2015Äê10ÔÂ8ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class MergeTwoSortedLists
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if (l1 == null)
		{
			return l2;
		}

		if (l2 == null)
		{
			return l1;
		}

		ListNode head = new ListNode(Integer.MIN_VALUE);
		ListNode cur = head, p1 = l1, p2 = l2;
		while (p1 != null && p2 != null)
		{
			while (p1 != null && p2 != null && p1.val <= p2.val)
			{
				cur.next = new ListNode(p1.val);
				cur = cur.next;
				p1 = p1.next;
			}

			while (p1 != null && p2 != null && p1.val > p2.val)
			{
				cur.next = new ListNode(p2.val);
				cur = cur.next;
				p2 = p2.next;
			}
		}

		if (p1 != null)
		{
			cur.next = p1;
		}

		if (p2 != null)
		{
			cur.next = p2;
		}

		return head.next;
	}
}
