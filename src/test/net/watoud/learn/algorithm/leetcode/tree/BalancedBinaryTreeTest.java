package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest
{
	@Test
	public void testIsBalanced()
	{
		BalancedBinaryTree sol = new BalancedBinaryTree();

		Assert.assertFalse(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "2", "3", "4", "X", "3", "5", //
		                "X", "X", "X", "X", "X", "X", "4", "5" })));
		Assert.assertFalse(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "3", "4", "X", "X", "X", "5" })));
		Assert.assertTrue(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "3", "4" })));
		Assert.assertTrue(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "3" })));
		Assert.assertTrue(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2" })));
		Assert.assertTrue(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] { "1" })));
		Assert.assertTrue(sol.isBalanced(TreeUtils.createTreeFromArray(//
		        new String[] {})));
	}
}
