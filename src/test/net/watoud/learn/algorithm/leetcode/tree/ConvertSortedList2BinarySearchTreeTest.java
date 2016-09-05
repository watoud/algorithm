package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.lists.ListUtils;

public class ConvertSortedList2BinarySearchTreeTest
{
	@Test
	public void testSortedListToBST()
	{
		ConvertSortedList2BinarySearchTree sol = new ConvertSortedList2BinarySearchTree();

		BalancedBinaryTree sol2 = new BalancedBinaryTree();

		Assert.assertTrue(sol2.isBalanced(sol.sortedListToBST(//
		        ListUtils.create4Array(new int[] { 1, 2 }))));
		Assert.assertTrue(sol2.isBalanced(sol.sortedListToBST(//
		        ListUtils.create4Array(new int[] { 1 }))));
		Assert.assertTrue(sol2.isBalanced(sol.sortedListToBST(//
		        ListUtils.create4Array(new int[] {}))));
		Assert.assertTrue(sol2.isBalanced(sol.sortedListToBST(//
		        ListUtils.create4Array(new int[] { 1, 2, 3, 4, 5, 6 }))));
	}
}
