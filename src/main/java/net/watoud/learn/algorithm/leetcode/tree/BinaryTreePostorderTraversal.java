package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal
{
	public List<Integer> postorderTraversal(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}

		Stack<TreeNode> st = new Stack<>();
		LinkedList<Integer> r = new LinkedList<>();
		st.push(root);

		TreeNode tmp = null;
		while (!st.isEmpty())
		{
			tmp = st.pop();
			r.addFirst(tmp.val);

			if (tmp.left != null)
			{
				st.push(tmp.left);
			}

			if (tmp.right != null)
			{
				st.push(tmp.right);
			}
		}

		return r;
	}
}
