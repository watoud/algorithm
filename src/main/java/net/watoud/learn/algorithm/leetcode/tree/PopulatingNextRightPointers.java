package net.watoud.learn.algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers
{
	public void connect(TreeLinkNode root)
	{
		if (root == null)
		{
			return;
		}

		Queue<TreeLinkNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		TreeLinkNode next = null, pre = null;
		while (!queue.isEmpty())
		{
			pre = queue.poll();
			while (pre != null)
			{
				if (pre.left != null)
				{
					queue.add(pre.left);
				}
				if (pre.right != null)
				{
					queue.add(pre.right);
				}
				next = queue.poll();
				if (next != null)
				{
					pre.next = next;
					pre = next;
				}
				else
				{
					break;
				}
			}

			queue.add(null);

			while (!queue.isEmpty() && (pre = queue.peek()) == null)
			{
				queue.poll();
			}
		}
	}
}
