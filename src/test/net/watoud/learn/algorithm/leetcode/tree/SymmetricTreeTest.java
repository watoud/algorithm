package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest
{
	@Test
	public void testIsSymmetric()
	{
		SymmetricTree sol = new SymmetricTree();

		Assert.assertTrue(sol.isSymmetric(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "12", "12", "X", "11", "11" })));

		Assert.assertFalse(sol.isSymmetric(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "2", "3", "X", "X", "3", "X", "4", //
		                "X", "X", "X", "X", "1" })));

		Assert.assertTrue(sol.isSymmetric(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "2", "2", "3", "X", "X", "3", "X", "4", //
		                "X", "X", "X", "X", "4" })));

		Assert.assertTrue(sol.isSymmetric(TreeUtils.createTreeFromArray(//
		        new String[] { "12" })));

		Assert.assertTrue(sol.isSymmetric(TreeUtils.createTreeFromArray(//
		        new String[] { "12", "1", "1" })));
		Assert.assertTrue(sol.isSymmetric(null));
	}
}
