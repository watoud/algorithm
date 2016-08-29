package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class FlattenBinaryTree2LinkedListTest
{
	@Test
	public void testFlatten()
	{
		FlattenBinaryTree2LinkedList sol = new FlattenBinaryTree2LinkedList();

		TreeNode root = TreeUtils.createTreeFromArray(//
		        new String[] { "1", "X", "2", "X", "X", "X", "3" });
		sol.flatten(root);
		TreeUtils.printTreeNode(null);
		TreeUtils.printTreeNode(root);
	}
}
