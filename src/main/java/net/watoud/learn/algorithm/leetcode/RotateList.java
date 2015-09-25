/**
 * RotateList.java
 * 2015Äê9ÔÂ25ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class RotateList
{
	public ListNode rotateRight(ListNode head, int k)
	{

		int length = 0;
		ListNode q = head;
		while (q != null)
		{
			q = q.next;
			length++;
		}

		if (head == null || length <= 0 || k % length == 0)
		{
			return head;
		}

		int count = k % length;
		ListNode pre = head, cur = head;

		while (pre.next != null && count > 0)
		{
			pre = pre.next;
			count--;
		}

		while (pre.next != null)
		{
			pre = pre.next;
			cur = cur.next;
		}

		pre.next = head;
		head = cur.next;
		cur.next = null;

		return head;
	}

	public static class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int x)
		{
			val = x;
		}
	}
}
