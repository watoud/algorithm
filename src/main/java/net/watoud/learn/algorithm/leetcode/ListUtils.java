/**
 * ListUtils.java
 * 2015Äê10ÔÂ22ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.List;

/**
 * @author lixudong
 *
 */
public class ListUtils
{
	public static <T> void print(List<List<T>> values)
	{
		for (List<T> v : values)
		{
			System.out.println(v);
		}
	}

	public static ListNode create4Array(int[] dat)
	{
		if (dat == null || dat.length == 0)
		{
			return null;
		}

		ListNode head = new ListNode(dat[0]);
		ListNode cur = head;

		for (int i = 1; i < dat.length; i++)
		{
			ListNode tmp = new ListNode(dat[i]);
			cur.next = tmp;
			cur = tmp;
		}

		return head;
	}

	public static void main(String[] args)
	{
		ListNode head = create4Array(new int[] { 1, 3, 4, 5, 6, 7, 8, 9 });
		while (head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
}
