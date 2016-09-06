package net.watoud.learn.algorithm.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

public class SortListTest
{
	@Test
	public void testSortList()
	{
		SortList sol = new SortList();

		Assert.assertArrayEquals(new int[] { 1, 3, 7, 9, 12 }, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] { 3, 1, 9, 7, 12 })), 5));
		Assert.assertArrayEquals(new int[] { 1, 3 }, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] { 3, 1 })), 2));
		Assert.assertArrayEquals(new int[] { 1, 3 }, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] { 1, 3 })), 2));
		Assert.assertArrayEquals(new int[] {}, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] {})), 1));
		Assert.assertArrayEquals(new int[] { 2 }, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] { 2 })), 1));
		Assert.assertArrayEquals(new int[] { 1, 3, 9, 56, 78 }, //
		        ListUtils.toArray(sol.sortList(ListUtils.create4Array(//
		                new int[] { 3, 1, 78, 56, 9 })), 5));

	}
}
