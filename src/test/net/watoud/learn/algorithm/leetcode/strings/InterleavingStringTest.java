package net.watoud.learn.algorithm.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class InterleavingStringTest
{
	@Test
	public void testIsInterleave()
	{
		InterleavingString sol = new InterleavingString();

		Assert.assertFalse(sol.isInterleave("a", "b", "a"));
		Assert.assertTrue(sol.isInterleave("a", null, "a"));
		Assert.assertTrue(sol.isInterleave(null, "a", "a"));
		Assert.assertTrue(sol.isInterleave("", "a", "a"));
		Assert.assertTrue(sol.isInterleave("a", "", "a"));
		Assert.assertFalse(sol.isInterleave(null, "", null));
		Assert.assertFalse(sol.isInterleave("", null, null));
		Assert.assertTrue(sol.isInterleave(null, null, null));
		Assert.assertFalse(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
		Assert.assertTrue(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
	}
}
