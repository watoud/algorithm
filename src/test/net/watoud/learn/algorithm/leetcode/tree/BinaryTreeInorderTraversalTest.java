package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeInorderTraversalTest
{
	@Test
	public void testInorderTraversal()
	{
		BinaryTreeInorderTraversal sol = new BinaryTreeInorderTraversal();

		Assert.assertArrayEquals(new Integer[] { 12, 1 }, sol.inorderTraversal(TreeUtils.createTreeFromArray(//
		        new String[] { "12", "X", "1" })).toArray());
		Assert.assertArrayEquals(new Integer[] { 1, 12 }, sol.inorderTraversal(TreeUtils.createTreeFromArray(//
		        new String[] { "12", "1" })).toArray());
		Assert.assertArrayEquals(new Integer[] { 1, 3, 2 }, sol.inorderTraversal(TreeUtils.createTreeFromArray(//
		        new String[] { "1", "X", "2", "X", "X", "3" })).toArray());
		Assert.assertArrayEquals(new Integer[] {}, sol.inorderTraversal(TreeUtils.createTreeFromArray(//
		        new String[] {})).toArray());
		Assert.assertArrayEquals(new Integer[] { 12 }, sol.inorderTraversal(TreeUtils.createTreeFromArray(//
		        new String[] { "12" })).toArray());

	}
}
