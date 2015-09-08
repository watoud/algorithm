/**
 * AddTwoNumbersTest.java
 * 2015Äê9ÔÂ8ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import net.watoud.learn.algorithm.leetcode.AddTwoNumbers;
import net.watoud.learn.algorithm.leetcode.AddTwoNumbers.ListNode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class AddTwoNumbersTest
{
	@Test
	public void testAddTwoNumbers()
	{
		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l1 = create(new int[] { 2, 4, 3 });
		ListNode l2 = create(new int[] { 5, 6, 4 });
		Assert.assertEquals("7->0->8", print(solution.addTwoNumbers(l1, l2)));

		l1 = create(new int[] { 2, 4 });
		l2 = create(new int[] { 5, 6, 4 });
		Assert.assertEquals("7->0->5", print(solution.addTwoNumbers(l1, l2)));

		l1 = create(new int[] { 2 });
		l2 = create(new int[] { 5 });
		Assert.assertEquals("7", print(solution.addTwoNumbers(l1, l2)));

		l1 = create(new int[] { 9 });
		l2 = create(new int[] { 6 });
		Assert.assertEquals("5->1", print(solution.addTwoNumbers(l1, l2)));

		l1 = create(new int[] { 9 });
		l2 = create(new int[] { 1 });
		Assert.assertEquals("0->1", print(solution.addTwoNumbers(l1, l2)));

		l1 = create(new int[] { 9, 9, 9, 9 });
		l2 = create(new int[] { 1 });
		Assert.assertEquals("0->0->0->0->1", print(solution.addTwoNumbers(l1, l2)));
	}

	public ListNode create(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			return null;
		}

		ListNode result = new ListNode(arr[0]);
		ListNode tmp = result;
		for (int i = 1; i < arr.length; i++)
		{
			tmp.next = new ListNode(arr[i]);
			tmp = tmp.next;
		}
		return result;
	}

	public String print(ListNode value)
	{
		StringBuilder builder = new StringBuilder();

		int index = 0;
		while (value != null)
		{
			if (index > 0)
			{
				builder.append("->");
			}
			builder.append(value.val);
			value = value.next;
			index++;
		}

		return builder.toString();
	}
}
