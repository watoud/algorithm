package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderPostorderTraversalTest
{
	@Test
	public void test()
	{
		ConstructBinaryTreeFromInorderPostorderTraversal sol = new ConstructBinaryTreeFromInorderPostorderTraversal();

		Assert.assertArrayEquals(new int[] { 12 },
		        TreeUtils.inorder(//
		                sol.buildTree(//
		                        new int[] { 12 }, //
		                        new int[] { 12 })));

		Assert.assertArrayEquals(new int[0],
		        TreeUtils.inorder(//
		                sol.buildTree(//
		                        new int[] {}, //
		                        new int[] {})));

		Assert.assertArrayEquals(new int[] { 7, 3, 9, 2, 3, 4 },
		        TreeUtils.inorder(//
		                sol.buildTree(//
		                        new int[] { 7, 3, 9, 2, 3, 4 }, //
		                        new int[] { 7, 9, 3, 3, 4, 2 })));
	}
}
