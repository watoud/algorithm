package net.watoud.learn.algorithm.leetcode.factorial;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZeroesTest
{
	@Test
	public void testTrailingZeroes()
	{
		FactorialTrailingZeroes sol = new FactorialTrailingZeroes();

		Assert.assertEquals(452137076, sol.trailingZeroes(1808548329));
		Assert.assertEquals(31, sol.trailingZeroes(126));
		Assert.assertEquals(6, sol.trailingZeroes(26));
		Assert.assertEquals(3, sol.trailingZeroes(15));
		Assert.assertEquals(2, sol.trailingZeroes(10));
		Assert.assertEquals(1, sol.trailingZeroes(6));
		Assert.assertEquals(1, sol.trailingZeroes(5));
		Assert.assertEquals(0, sol.trailingZeroes(1));
		Assert.assertEquals(0, sol.trailingZeroes(0));
		Assert.assertEquals(0, sol.trailingZeroes(-1));
	}
}
