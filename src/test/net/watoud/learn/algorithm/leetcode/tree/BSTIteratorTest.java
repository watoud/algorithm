package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

public class BSTIteratorTest
{
	@Test
	public void testIterator()
	{
		int[] source = new int[] { 3, 5, 34, 239, 87, 96, 7 };
		TreeNode root = TreeUtils.createBST(source);

		BSTIterator sol = new BSTIterator(root);
		int[] itrDat = new int[source.length];
		int index = 0;
		while (sol.hasNext())
		{
			itrDat[index] = sol.next();
			index++;
		}

		int[] expected = new int[] { 3, 5, 7, 34, 87, 96, 239 };
		Assert.assertArrayEquals(expected, itrDat);

		sol = new BSTIterator(null);
		Assert.assertFalse(sol.hasNext());
	}

}
