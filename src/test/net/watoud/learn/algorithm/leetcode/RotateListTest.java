/**
 * RotateListTest.java
 * 2015Äê9ÔÂ25ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import net.watoud.learn.algorithm.leetcode.RotateList.ListNode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class RotateListTest
{
	@Test
	public void testRotateRight()
	{
		RotateList solution = new RotateList();

		ListNode test = createFromArray(new int[] { 1, 2, 3, 4, 5 });
		ListNode result = solution.rotateRight(test, 2);
		Assert.assertEquals("4 5 1 2 3 ", print(result));

		test = createFromArray(new int[] { 1 });
		result = solution.rotateRight(test, 1);
		Assert.assertEquals("1 ", print(result));

		test = createFromArray(new int[] { 1, 2 });
		result = solution.rotateRight(test, 1);
		Assert.assertEquals("2 1 ", print(result));

		test = createFromArray(new int[] { 1, 2 });
		result = solution.rotateRight(test, 2);
		Assert.assertEquals("1 2 ", print(result));

		test = createFromArray(new int[] { 1, 2 });
		result = solution.rotateRight(test, 3);
		Assert.assertEquals("2 1 ", print(result));

		test = createFromArray(new int[] { 1, 2, 3, 4, 5, 6 });
		result = solution.rotateRight(test, 3);
		Assert.assertEquals("4 5 6 1 2 3 ", print(result));

		test = createFromArray(new int[] { 1, 2, 3, 4, 5, 6 });
		result = solution.rotateRight(test, 2);
		Assert.assertEquals("5 6 1 2 3 4 ", print(result));

		test = createFromArray(new int[] { 1, 2, 3, 4, 5, 6 });
		result = solution.rotateRight(test, 5);
		Assert.assertEquals("2 3 4 5 6 1 ", print(result));
	}

	@Test
	@Ignore
	public void testCreate()
	{
		ListNode test = createFromArray(new int[] { 1, 6, 3, 4, 5 });
		Assert.assertEquals("1 6 3 4 5 ", print(test));

		test = createFromArray(new int[] { 1 });
		Assert.assertEquals("1 ", print(test));
	}

	public ListNode createFromArray(int[] arr)
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

	public String print(ListNode head)
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
