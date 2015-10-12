/**
 * MergekSortedLists.java
 * 2015年10月12日
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class MergekSortedLists
{
	public ListNode mergeKLists(ListNode[] lists)
	{
		if (lists == null)
		{
			return null;
		}

		List<ListNode> inputList = new ArrayList<ListNode>();
		for (int i = 0; i < lists.length; i++)
		{
			if (lists[i] != null)
			{
				inputList.add(lists[i]);
			}
		}

		if (inputList.size() == 0)
		{
			return null;
		}

		if (inputList.size() == 1)
		{
			return inputList.get(0);
		}

		ListNode[] input = inputList.toArray(new ListNode[0]);

		ListNode head = new ListNode(Integer.MIN_VALUE);
		ListNode cur = head;

		// 把链表按照第一个节点的值排序
		// sort(input);

		Arrays.sort(input, new ListNodeComparator());

		int index = 0;
		while (index < input.length)
		{
			if (index + 1 >= input.length)
			{
				cur.next = input[index];
				while (cur.next != null)
				{
					cur = cur.next;
				}
				break;
			}

			while (input[index] != null && input[index].val <= input[index + 1].val)
			{
				cur.next = input[index];
				cur = cur.next;
				input[index] = input[index].next;
			}

			if (input[index] == null)
			{
				index++;
				continue;
			}

			int i = index;
			while (i + 1 < input.length && input[i].val > input[i + 1].val)
			{
				ListNode tmp = input[i];
				input[i] = input[i + 1];
				input[i + 1] = tmp;
				i++;
			}

		}

		return head.next;
	}

	// /**
	// * @param lists
	// */
	// private void sort(ListNode[] lists)
	// {
	// for (int i = 0; i < lists.length; i++)
	// {
	// int cur = i;
	// for (int j = i + 1; j < lists.length; j++)
	// {
	// if (lists[cur].val > lists[j].val)
	// {
	// cur = j;
	// }
	// }
	//
	// if (lists[cur] != lists[i])
	// {
	// ListNode tmp = lists[i];
	// lists[i] = lists[cur];
	// lists[cur] = tmp;
	// }
	// }
	// }

	public static class ListNodeComparator implements Comparator<ListNode>
	{
		@Override
		public int compare(ListNode o1, ListNode o2)
		{
			if (o1.val < o2.val)
			{
				return -1;
			}
			else if (o1.val == o2.val)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}

	}
}
