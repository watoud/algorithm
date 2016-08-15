package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest
{
	@Test
	public void testReverseBits()
	{
		ReverseBits sol = new ReverseBits();

		Assert.assertEquals(0b00111001011110000010100101000000, //
		        sol.reverseBits(0b00000010100101000001111010011100));

		Assert.assertEquals(0b00111000_00000000_00101001_01000000, //
		        sol.reverseBits(0b00000010_10010100_00000000_00011100));
	}
}
