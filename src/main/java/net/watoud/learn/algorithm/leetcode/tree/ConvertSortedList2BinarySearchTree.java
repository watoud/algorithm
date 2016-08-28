package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

import net.watoud.learn.algorithm.leetcode.ListNode;

public class ConvertSortedList2BinarySearchTree
{
	public TreeNode sortedListToBST(ListNode head)
	{
		if (head == null)
		{
			return null;
		}

		List<Integer> in = new ArrayList<>();
		while (head != null)
		{
			in.add(head.val);
			head = head.next;

		}

		int[] dat = new int[in.size()];
		for (int i = 0; i < in.size(); i++)
		{
			dat[i] = in.get(i);
		}

		return sortedArrayToBSTAux(dat, 0, in.size() - 1);
	}

	private TreeNode sortedArrayToBSTAux(int[] dat, int begin, int end)
	{
		if (end < begin)
		{
			return null;
		}

		int m = (begin + end) / 2;
		TreeNode root = new TreeNode(dat[m]);
		root.left = sortedArrayToBSTAux(dat, begin, m - 1);
		root.right = sortedArrayToBSTAux(dat, m + 1, end);
		return root;
	}
}
