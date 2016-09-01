package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal
{
	public List<Integer> inorderTraversal(TreeNode root)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		TreeNode tmp = root.left;
		while (tmp != null)
		{
			st.push(tmp);
			tmp = tmp.left;
		}
		while (!st.isEmpty())
		{
			tmp = st.pop();
			result.add(tmp.val);
			tmp = tmp.right;
			while (tmp != null)
			{
				st.push(tmp);
				tmp = tmp.left;
			}
		}
		return result;
	}
}
