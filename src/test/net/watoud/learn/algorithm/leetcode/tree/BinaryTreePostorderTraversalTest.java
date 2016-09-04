package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePostorderTraversalTest
{
	@Test
	public void testPostorderTraversal()
	{
		BinaryTreePostorderTraversal sol = new BinaryTreePostorderTraversal();

		Assert.assertArrayEquals(new Integer[] { 2, 1 },
		        sol.postorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "X", "2" })).toArray(new Integer[0]));

		Assert.assertArrayEquals(new Integer[] { 2, 1 },
		        sol.postorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "2" })).toArray(new Integer[0]));
		Assert.assertArrayEquals(new Integer[] {}, sol.postorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		})).toArray(new Integer[0]));
		Assert.assertArrayEquals(new Integer[] { 4, 2, 9, 7, 3, 1 },
		        sol.postorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "2", "3", "4", "X", "9", "7" })).toArray(new Integer[0]));

		Assert.assertArrayEquals(new Integer[] { 3, 2, 1 },
		        sol.postorderTraversal(TreeUtils.createTreeFromArray(new String[] { //
		                "1", "X", "2", "X", "X", "3" })).toArray(new Integer[0]));
	}
}
