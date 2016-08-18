package net.watoud.learn.algorithm.leetcode.tree;

import java.util.Stack;

public class BSTIterator
{
	private Stack<TreeNode> stack = new Stack<>();

	private TreeNode currentNode = null;

	public BSTIterator(TreeNode root)
	{
		TreeNode cur = root;
		while (cur != null)
		{
			stack.push(cur);
			cur = cur.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext()
	{
		if (stack.isEmpty())
		{
			return false;
		}

		currentNode = stack.pop();

		TreeNode r = currentNode.right;
		while (r != null)
		{
			stack.push(r);
			r = r.left;
		}

		return true;
	}

	/** @return the next smallest number */
	public int next()
	{
		return currentNode.val;
	}
}
