package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class PopulatingNextRightPointersTest
{
	@Test
	public void testConnect()
	{
		PopulatingNextRightPointers sol = new PopulatingNextRightPointers();

		sol.connect(TreeUtils.createTreeLinkNodesFromArray(//
		        new String[] { "1", "2", "3", "4", "X", "5", "6" }));
	}
}
