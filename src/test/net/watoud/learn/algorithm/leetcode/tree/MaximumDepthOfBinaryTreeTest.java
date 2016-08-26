package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest
{
	@Test
	public void testMaxDepth()
	{
		MaximumDepthOfBinaryTree sol = new MaximumDepthOfBinaryTree();

		Assert.assertEquals(2, //
		        sol.maxDepth(TreeUtils.createTreeFromArray(new String[] { "2", "4" })));
		Assert.assertEquals(3, //
		        sol.maxDepth(TreeUtils.createTreeFromArray(new String[] { //
		                "2", "4", "X", "X", "7"//
				})));
		Assert.assertEquals(1, //
		        sol.maxDepth(TreeUtils.createTreeFromArray(new String[] { "2" })));
		Assert.assertEquals(0, //
		        sol.maxDepth(TreeUtils.createTreeFromArray(new String[] {})));
		Assert.assertEquals(4, //
		        sol.maxDepth(TreeUtils.createTreeFromArray(new String[] { //
		                "2", "4", "7", "X", "2", "X", "6", "X", "X", "3" //
				})));
	}
}
