/**
 * RemoveNthNodeFromEndOfList.java
 * 2015Äê10ÔÂ19ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
    Given a linked list, remove the nth node from the end of list and return its head.
    
    For example,
    
       Given linked list: 1->2->3->4->5, and n = 2.
    
       After removing the second node from the end, the linked list becomes 1->2->3->5.
    Note:
    Given n will always be valid.
    Try to do this in one pass.

 */
public class RemoveNthNodeFromEndOfList
{
	public static void main(String[] args)
	{
		RemoveNthNodeFromEndOfList sol = new RemoveNthNodeFromEndOfList();

		System.out.println(ListNodeUtils.print(sol.removeNthFromEnd(
		        ListNodeUtils.createFromArray(new int[] { 1 }), 1)));

		System.out.println(ListNodeUtils.print(sol.removeNthFromEnd(
		        ListNodeUtils.createFromArray(new int[] { 1, 2, 3, 4, 5 }), 5)));
		System.out.println(ListNodeUtils.print(sol.removeNthFromEnd(
		        ListNodeUtils.createFromArray(new int[] { 1, 2, 3, 4, 5 }), 2)));
	}

	public ListNode removeNthFromEnd(ListNode head, int n)
	{
		if (head == null)
		{
			return null;
		}
		// Given n will always be valid
		ListNode pre = head, cur = head;

		while (n > 0 && pre.next != null)
		{
			n--;
			pre = pre.next;
		}

		if (n == 1)
		{
			return head.next;
		}

		while (pre.next != null)
		{
			pre = pre.next;
			cur = cur.next;
		}

		cur.next = cur.next.next;

		return head;
	}
}
