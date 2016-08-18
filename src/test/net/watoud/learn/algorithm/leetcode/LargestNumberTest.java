package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest
{
	@Test
	public void testLargestNumber()
	{
		LargestNumber sol = new LargestNumber();

		Assert.assertEquals("0", sol.largestNumber(new int[] { 0, 0 }));
		Assert.assertEquals("1212122121212", sol.largestNumber(new int[] { 12, 1212, 1212122 }));
		Assert.assertEquals("121212121212", sol.largestNumber(new int[] { 12, 1212, 121212 }));
		Assert.assertEquals("43454312110", sol.largestNumber(new int[] { 1, 10, 12, 43, 4345 }));
		Assert.assertEquals("12110", sol.largestNumber(new int[] { 1, 10, 12 }));
		Assert.assertEquals("101", sol.largestNumber(new int[] { 101 }));
		Assert.assertEquals("0", sol.largestNumber(null));
		Assert.assertEquals("0", sol.largestNumber(new int[] {}));
		Assert.assertEquals("9534330", sol.largestNumber(new int[] { 3, 30, 34, 5, 9 }));
	}
}
