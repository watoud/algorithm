package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest
{
	@Test
	public void testMinDepth()
	{
		MinimumDepthOfBinaryTree sol = new MinimumDepthOfBinaryTree();

		Assert.assertEquals(3, //
		        sol.minDepth(//
		                TreeUtils.createTreeFromArray(//
		                        new String[] { "1", "2", "3", "4", "X", "X", "5" })));

		Assert.assertEquals(2, //
		        sol.minDepth(//
		                TreeUtils.createTreeFromArray(//
		                        new String[] { "1", "2", "3" })));

		Assert.assertEquals(0, //
		        sol.minDepth(//
		                TreeUtils.createTreeFromArray(//
		                        new String[] {})));
		Assert.assertEquals(1, //
		        sol.minDepth(//
		                TreeUtils.createTreeFromArray(//
		                        new String[] { "1" })));
		Assert.assertEquals(2, //
		        sol.minDepth(//
		                TreeUtils.createTreeFromArray(//
		                        new String[] { "1", "2" })));
	}
}
