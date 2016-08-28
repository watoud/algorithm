package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class BinaryTreeLevelOrderTraversalIITest
{
	@Test
	public void testLevelOrderBottom()
	{
		BinaryTreeLevelOrderTraversalII sol = new BinaryTreeLevelOrderTraversalII();

		System.out.println(sol.levelOrderBottom(//
		        TreeUtils.createTreeFromArray(//
		                new String[] { "3", "9", "20", "X", "X", "15", "7" })));
	}
}
