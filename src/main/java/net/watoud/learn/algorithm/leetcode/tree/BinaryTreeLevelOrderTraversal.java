package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal
{
	public List<List<Integer>> levelOrder(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty())
		{
			TreeNode tmp = null;
			List<Integer> dat = new ArrayList<>();
			while ((tmp = queue.poll()) != null)
			{
				dat.add(tmp.val);
				if (tmp.left != null)
				{
					queue.add(tmp.left);
				}

				if (tmp.right != null)
				{
					queue.add(tmp.right);
				}
			}
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
