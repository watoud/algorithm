package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class PathSumTest
{
	@Test
	public void testHasPathSum()
	{
		PathSum sol = new PathSum();

		Assert.assertTrue(sol.hasPathSum(new TreeNode(18), 18));
		Assert.assertFalse(sol.hasPathSum(new TreeNode(11), 18));
		Assert.assertFalse(sol.hasPathSum(null, 18));

		//
		TreeNode root = TreeUtils.createTreeFromArray(//
		        new String[] { //
		                "2", "7", "3", "9", "5", "2", "X", "X", "X", "1" //
				});
		Assert.assertTrue(sol.hasPathSum(root, 18));

		//
		root = TreeUtils.createTreeFromArray(//
		        new String[] { //
		                "2", "7", "3", "9", "5", "2", "X", "X", "X", "1" //
				});
		Assert.assertTrue(sol.hasPathSum(root, 15));

		//
		root = TreeUtils.createTreeFromArray(//
		        new String[] { //
		                "2", "7", "3", "9", "5", "2", "X", "X", "X", "1" //
				});
		Assert.assertFalse(sol.hasPathSum(root, 5));

		//
		root = TreeUtils.createTreeFromArray(//
		        new String[] { //
		                "2", "7", "3", "9", "5", "2", "X", "X", "X", "1" //
				});
		Assert.assertTrue(sol.hasPathSum(root, 7));

	}

}
