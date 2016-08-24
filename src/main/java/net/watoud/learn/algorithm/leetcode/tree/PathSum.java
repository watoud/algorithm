package net.watoud.learn.algorithm.leetcode.tree;

import java.util.Stack;

public class PathSum
{
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if (root == null)
		{
			return false;
		}

		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		TreeNode cur = null;
		while (!st.empty())
		{
			cur = st.pop();
			if (cur.left == null && cur.right == null && cur.val == sum)
			{
				return true;
			}

			if (cur.left != null)
			{
				cur.left.val += cur.val;
				st.push(cur.left);
			}

			if (cur.right != null)
			{
				cur.right.val += cur.val;
				st.push(cur.right);
			}
		}

		return false;
	}
}
