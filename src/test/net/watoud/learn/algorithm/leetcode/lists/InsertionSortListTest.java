package net.watoud.learn.algorithm.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortListTest
{
	@Test
	public void testInsertionSortList()
	{
		InsertionSortList sol = new InsertionSortList();

		Assert.assertArrayEquals(new int[] { 1, 2, 3, 9 }, ListUtils.toArray(sol.insertionSortList(//
		        ListUtils.create4Array(new int[] { 3, 2, 1, 9 })), 4));
		Assert.assertArrayEquals(new int[] { 2, 3 }, ListUtils.toArray(sol.insertionSortList(//
		        ListUtils.create4Array(new int[] { 3, 2 })), 2));
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4 }, ListUtils.toArray(sol.insertionSortList(//
		        ListUtils.create4Array(new int[] { 1, 2, 3, 4 })), 4));
		Assert.assertNull(sol.insertionSortList(null));
		Assert.assertArrayEquals(new int[] { 1 }, ListUtils.toArray(sol.insertionSortList(//
		        ListUtils.create4Array(new int[] { 1 })), 1));
		Assert.assertArrayEquals(new int[] { 1, 6, 9, 24, 34, 67 }, ListUtils.toArray(sol.insertionSortList(//
		        ListUtils.create4Array(new int[] { 1, 34, 24, 67, 6, 9 })), 6));
	}
}
