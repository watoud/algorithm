package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePreorderTraversalTest
{
	@Test
	public void testPreorderTraversal()
	{
		BinaryTreePreorderTraversal sol = new BinaryTreePreorderTraversal();

		Assert.assertArrayEquals(new Integer[] {}, sol.preorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		})).toArray(new Integer[0]));
		Assert.assertArrayEquals(new Integer[] { 1, 2, 3 },
		        sol.preorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "X", "2", "X", "X", "3" })).toArray(new Integer[0]));
		Assert.assertArrayEquals(new Integer[] { 1, 2, 3, 4 },
		        sol.preorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "2", "3", "X", "X", "4" })).toArray(new Integer[0]));
	}
}
