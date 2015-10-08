/**
 * ListNodeUtils.java
 * 2015Äê10ÔÂ9ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;


/**
 * @author lixudong
 *
 */
public class ListNodeUtils
{
	public static ListNode createFromArray(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			return null;
		}
		ListNode head = new ListNode(arr[0]);
		ListNode cur = head;
		for (int i = 1; i < arr.length; i++)
		{
			cur.next = new ListNode(arr[i]);
			cur = cur.next;
		}
		return head;
	}

	public static String print(ListNode head)
	{
		StringBuilder builder = new StringBuilder();
		while (head != null)
		{
			builder.append(head.val + " ");
			head = head.next;
		}

		return builder.toString();
	}
}
