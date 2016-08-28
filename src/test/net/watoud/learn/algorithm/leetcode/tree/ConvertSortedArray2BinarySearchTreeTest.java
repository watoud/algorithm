package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedArray2BinarySearchTreeTest
{
	@Test
	public void testSortedArrayToBST()
	{
		ConvertSortedArray2BinarySearchTree sol = new ConvertSortedArray2BinarySearchTree();

		BalancedBinaryTree sol2 = new BalancedBinaryTree();

		Assert.assertTrue(sol2.isBalanced(sol.sortedArrayToBST(//
		        new int[] { 1, 2 })));
		Assert.assertTrue(sol2.isBalanced(sol.sortedArrayToBST(//
		        new int[] { 1 })));
		Assert.assertTrue(sol2.isBalanced(sol.sortedArrayToBST(//
		        new int[] {})));
		Assert.assertTrue(sol2.isBalanced(sol.sortedArrayToBST(//
		        new int[] { 1, 2, 3, 4, 5, 6 })));
	}
}
