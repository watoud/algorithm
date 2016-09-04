package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal
{
	public List<Integer> preorderTraversal(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}
		Stack<TreeNode> st = new Stack<>();
		List<Integer> r = new ArrayList<>();
		st.push(root);

		while (!st.isEmpty())
		{
			TreeNode tmp = st.pop();
			r.add(tmp.val);

			if (tmp.right != null)
			{
				st.push(tmp.right);
			}

			if (tmp.left != null)
			{
				st.push(tmp.left);
			}
		}
		return r;
	}
}
