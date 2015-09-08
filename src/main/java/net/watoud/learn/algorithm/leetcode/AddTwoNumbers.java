/**
 * AddTwoNumbers.java
 * 2015年9月8日
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 *         You are given two linked lists representing <B>two non-negative
 *         numbers<B>.
 *         The digits are stored in reverse order and each of their nodes
 *         contain a single digit. Add the two numbers and return it as a linked
 *         list.
 * 
 *         Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *         Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		// 如果有一个为null，则返回null
		if (l1 == null || l2 == null)
		{
			return null;
		}

		int carry = 0;
		int value = l1.val + l2.val;
		if (value >= 10)
		{
			value = value - 10;
			carry = 1;
		}

		ListNode head = new ListNode(value);
		ListNode tmp = head;
		l1 = l1.next;
		l2 = l2.next;

		while (l1 != null && l2 != null)
		{
			value = l1.val + l2.val + carry;
			if (value >= 10)
			{
				value = value - 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			tmp.next = new ListNode(value);
			tmp = tmp.next;

			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null)
		{
			value = l1.val + carry;
			if (value >= 10)
			{
				value = value - 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			tmp.next = new ListNode(value);
			tmp = tmp.next;
			l1 = l1.next;
		}

		while (l2 != null)
		{
			value = l2.val + carry;
			if (value >= 10)
			{
				value = value - 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			tmp.next = new ListNode(value);
			tmp = tmp.next;
			l2 = l2.next;
		}

		if (carry != 0)
		{
			tmp.next = new ListNode(carry);
		}

		return head;
	}

	public static class ListNode
	{
		public int val;
		public ListNode next;

		public ListNode(int x)
		{
			val = x;
		}
	}
}
