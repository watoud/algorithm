/**
 * ContainerWithMostWaterTest.java
 * 2015Äê10ÔÂ20ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ContainerWithMostWaterTest
{
	@Test
	public void testMaxArea()
	{
		ContainerWithMostWater sol = new ContainerWithMostWater();

		Assert.assertEquals(50, sol.maxArea(new int[] { 1, 2, 3, 100, 50, 1 }));
		Assert.assertEquals(2, sol.maxArea(new int[] { 1, 2, 3 }));
		Assert.assertEquals(1, sol.maxArea(new int[] { 1, 2 }));
	}
}
