package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromPreorderInorderTraversalTest
{

	@Test
	public void testBuildTree()
	{
		ConstructBinaryTreeFromPreorderInorderTraversal sol = new ConstructBinaryTreeFromPreorderInorderTraversal();

		Assert.assertArrayEquals(new int[] { 4, 2, 1 }, //
		        TreeUtils.inorder(sol.buildTree(new int[] { 1, 2, 4 }, //
		                new int[] { 4, 2, 1 })));

		Assert.assertArrayEquals(new int[] { 4, 2, 5, 1, 3, 7 }, //
		        TreeUtils.inorder(sol.buildTree(new int[] { 1, 2, 4, 5, 3, 7 }, //
		                new int[] { 4, 2, 5, 1, 3, 7 })));
		Assert.assertArrayEquals(new int[0], //
		        TreeUtils.inorder(sol.buildTree(new int[] {}, new int[] {})));
		Assert.assertArrayEquals(new int[0], //
		        TreeUtils.inorder(sol.buildTree(null, null)));
		Assert.assertArrayEquals(new int[] { 1 }, //
		        TreeUtils.inorder(sol.buildTree(new int[] { 1 }, new int[] { 1 })));

	}
}
