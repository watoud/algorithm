/**
 * SwapNodesinPairs.java
 * 2015Äê10ÔÂ12ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class SwapNodesinPairs
{
	public ListNode swapPairs(ListNode head)
	{
		if (head == null)
		{
			return null;
		}
		ListNode result = new ListNode(Integer.MIN_VALUE), cur = result;
		ListNode pre = head;
		while (pre != null && pre.next != null)
		{
			ListNode tmp = pre.next.next;
			cur.next = pre.next;
			pre.next.next = pre;
			cur = pre;
			pre = tmp;
		}

		if (pre != null)
		{
			cur.next = pre;
			cur = cur.next;
		}

		cur.next = null;
		return result.next;
	}
}
