package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class PathSumIITest
{
	@Test
	public void testPathSum()
	{
		PathSumII sol = new PathSumII();

		TreeNode root = TreeUtils.createTreeFromArray(//
		        new String[] //
				{ //
				        "2", "1", "3", "4", "5", "3", "7", "X", "1" //
				});

		Assert.assertEquals(0, sol.pathSum(null, 8).size());
		Assert.assertEquals(3, sol.pathSum(root, 8).size());

	}
}
