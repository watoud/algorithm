package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class TreeUtilsTest
{
	@Test
	public void testCreateBSTTree()
	{
		TreeNode root = TreeUtils.createBST(new int[] { 3, 5, 34, 239, 87, 96, 7 });
		TreeUtils.printTreeNode(root);
	}
}
