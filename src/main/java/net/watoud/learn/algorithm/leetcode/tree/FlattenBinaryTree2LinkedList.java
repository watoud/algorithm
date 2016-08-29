package net.watoud.learn.algorithm.leetcode.tree;

import java.util.Stack;

public class FlattenBinaryTree2LinkedList
{
	public void flatten(TreeNode root)
	{
		if (root == null)
		{
			return;
		}

		Stack<TreeNode> st = new Stack<>();
		st.push(root);

		TreeNode link = null;
		while (!st.empty())
		{
			TreeNode cur = st.pop();
			if (link != null)
			{
				link.right = cur;
			}
			while (cur.left != null)
			{
				if (cur.right != null)
				{
					st.push(cur.right);
				}
				cur.right = cur.left;
				cur.left = null;
				cur = cur.right;
			}
			if (cur.right != null)
			{
				st.push(cur.right);
			}
			link = cur;
		}
	}
}
