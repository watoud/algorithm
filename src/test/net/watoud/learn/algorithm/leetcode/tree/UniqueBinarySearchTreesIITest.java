package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesIITest
{
	@Test
	public void testGenerateTrees()
	{
		UniqueBinarySearchTreesII sol = new UniqueBinarySearchTreesII();

		Assert.assertEquals(1, sol.generateTrees(1).size());
		Assert.assertEquals(2, sol.generateTrees(2).size());
		Assert.assertEquals(5, sol.generateTrees(3).size());
		for (TreeNode root : sol.generateTrees(4))
		{
			TreeUtils.printTreeNode(root);
			System.out.println("----------------------------------------");
		}

	}
}
