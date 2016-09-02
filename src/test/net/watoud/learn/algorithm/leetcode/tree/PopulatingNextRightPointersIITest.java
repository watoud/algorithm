package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class PopulatingNextRightPointersIITest
{
	@Test
	public void testConnect()
	{
		PopulatingNextRightPointersII sol = new PopulatingNextRightPointersII();

		TreeLinkNode root = TreeUtils.createTreeLinkNodesFromArray(//
		        new String[] { "1", "2", "3", "4", "5", "X", //
		                "7", "X", "X", "8", "X", "X", "X", "9" });
		sol.connect(root);

		sol.connect(TreeUtils.createTreeLinkNodesFromArray(//
		        new String[] { "1", "2", "3", "4", "X", "5", "6" }));
	}
}
