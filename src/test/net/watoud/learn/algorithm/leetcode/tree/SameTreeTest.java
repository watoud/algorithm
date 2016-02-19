package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest
{

	@Test
	public void testEmptyTree()
	{
		SameTree st = new SameTree();

		Assert.assertTrue(st.isSameTree(null, null));
		Assert.assertFalse(st.isSameTree(null, new TreeNode(0)));
		Assert.assertFalse(st.isSameTree(new TreeNode(0), null));
	}

	@Test
	public void testSameTree()
	{
		SameTree st = new SameTree();

		Assert.assertTrue(st.isSameTree(generateTree1(), generateTree1()));
	}

	@Test
	public void testNodeSameTree()
	{
		SameTree st = new SameTree();

		Assert.assertFalse(st.isSameTree(generateTree1(), generateTree2()));
	}

	private TreeNode generateTree2()
	{
		TreeNode root = new TreeNode(0);

		TreeNode left1 = new TreeNode(11);
		TreeNode right1 = new TreeNode(12);

		root.left = left1;
		root.right = right1;

		return root;
	}

	private TreeNode generateTree1()
	{
		TreeNode root = new TreeNode(0);

		TreeNode left1 = new TreeNode(11);
		TreeNode right1 = new TreeNode(12);

		root.left = left1;
		root.right = right1;

		TreeNode left2 = new TreeNode(21);
		right1.right = left2;

		return root;
	}
}
