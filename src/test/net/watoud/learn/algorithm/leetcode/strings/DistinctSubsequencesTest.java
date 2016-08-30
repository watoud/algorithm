package net.watoud.learn.algorithm.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class DistinctSubsequencesTest
{
	@Test
	public void testNumDistinct()
	{
		DistinctSubsequences sol = new DistinctSubsequences();

		Assert.assertEquals(3, sol.numDistinct("CCC", "C"));
		Assert.assertEquals(0, sol.numDistinct("ACE", "ABCDE"));
		Assert.assertEquals(1, sol.numDistinct("ABCDE", "ACE"));
		Assert.assertEquals(0, sol.numDistinct(null, ""));
		Assert.assertEquals(1, sol.numDistinct("", null));
		Assert.assertEquals(1, sol.numDistinct(null, null));
		Assert.assertEquals(3, sol.numDistinct("rabbbit", "rabbit"));
	}
}
