/**
 * ReverseNodesInKGroup.java
 * 2015Äê10ÔÂ12ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 	Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
    
    If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
    
    You may not alter the values in the nodes, only nodes itself may be changed.
    
    Only constant memory is allowed.
    
    For example,
    Given this linked list: 1->2->3->4->5
    
    For k = 2, you should return: 2->1->4->3->5
    
    For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesInKGroup
{
	public ListNode reverseKGroup(ListNode head, int k)
	{
		if (head == null)
		{
			return null;
		}

		if (k <= 1)
		{
			return head;
		}

		ListNode result = new ListNode(Integer.MIN_VALUE);
		ListNode cur = result, pre = head;

		while (pre != null)
		{
			ListNode first = pre;
			int count = 0;
			while (pre != null && count < k)
			{
				pre = pre.next;
				count++;
			}

			if (count < k)
			{
				cur.next = first;
				break;
			}

			ListNode innerHead = null, tmp = null;
			while (first != pre)
			{
				tmp = first;
				first = first.next;
				tmp.next = innerHead;
				innerHead = tmp;
			}

			cur.next = innerHead;
			while (cur.next != null)
			{
				cur = cur.next;
			}
		}

		return result.next;
	}
}
