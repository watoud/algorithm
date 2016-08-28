package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII
{
	public List<List<Integer>> levelOrderBottom(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}

		LinkedList<List<Integer>> result = new LinkedList<>();

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty())
		{
			List<Integer> dat = new ArrayList<>();
			TreeNode tmp = null;

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
				result.addFirst(dat);
			}

			while (!queue.isEmpty() && queue.peek() == null)
			{
				queue.poll();
			}
		}

		return result;
	}
}
