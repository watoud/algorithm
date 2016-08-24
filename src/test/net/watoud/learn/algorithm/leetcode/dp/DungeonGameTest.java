package net.watoud.learn.algorithm.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class DungeonGameTest
{
	@Test
	public void testCalculateMinimumHP()
	{
		DungeonGame sol = new DungeonGame();
		int actual = sol.calculateMinimumHP(new int[][] { //
		        { 1, -3, 3 }, //
		        { 0, -2, 0 }, //
		        { -3, -3, -3 }//
		});
		Assert.assertEquals(3, actual);

		actual = sol.calculateMinimumHP(new int[][] { //
		        { -2, -3, 3 }, //
		        { -5, -10, 1 }, //
		        { 10, 30, -5 }//
		});
		Assert.assertEquals(7, actual);

		actual = sol.calculateMinimumHP(new int[][] { //
		        { -2, -3 }, //
		        { -5, -10 } //

		});

		Assert.assertEquals(16, actual);
	}
}
