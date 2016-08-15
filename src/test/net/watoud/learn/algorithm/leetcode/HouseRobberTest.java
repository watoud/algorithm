package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest
{
	@Test
	public void testRob()
	{
		HouseRobber t = new HouseRobber();

		Assert.assertEquals(0, t.rob(new int[] {}));

		Assert.assertEquals(1, t.rob(new int[] { 1 }));

		Assert.assertEquals(3, t.rob(new int[] { 1, 3 }));

		Assert.assertEquals(100, t.rob(new int[] { 1, 100, 34 }));

		Assert.assertEquals(200, t.rob(new int[] { 1, 100, 34, 100 }));

		Assert.assertEquals(200, t.rob(new int[] { 1, 100, 34, 20, 100 }));

		Assert.assertEquals(120, t.rob(new int[] { 1, 100, 34, 20, 1 }));

		Assert.assertEquals(220, t.rob(new int[] { 1, 100, 34, 20, 33, 100 }));

	}
}
