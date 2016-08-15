package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class NumberOf1BitsTest
{
	@Test
	public void testHammingWeight()
	{
		NumberOf1Bits sol = new NumberOf1Bits();

		Assert.assertEquals(2, sol.hammingWeight(3));
		Assert.assertEquals(1, sol.hammingWeight(1));
		Assert.assertEquals(3, sol.hammingWeight(0b100011));
		Assert.assertEquals(1, sol.hammingWeight(0b10000000000000000000000000000000));
	}

}
