package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal
{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		queue.add(null);

		int flag = 0;

		while (!queue.isEmpty())
		{
			TreeNode tmp = null;
			LinkedList<Integer> dat = new LinkedList<>();
			while ((tmp = queue.poll()) != null)
			{
				if (flag % 2 == 0)
				{
					dat.addLast(tmp.val);
				}
				else
				{
					dat.addFirst(tmp.val);
				}

				if (tmp.left != null)
				{
					queue.add(tmp.left);
				}

				if (tmp.right != null)
				{
					queue.add(tmp.right);
				}
			}
			flag++;
			queue.add(null);

			if (dat.size() != 0)
			{
				result.add(dat);
			}

			while (!queue.isEmpty())
			{
				if (queue.peek() != null)
				{
					break;
				}

				queue.poll();
			}
		}

		return result;
	}
}
