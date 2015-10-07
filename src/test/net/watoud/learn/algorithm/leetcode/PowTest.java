/**
 * PowTest.java
 * 2015Äê10ÔÂ7ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class PowTest
{
	@Test
	public void testMyPow()
	{
		Pow solution = new Pow();

		Assert.assertEquals(-1000d, solution.myPow(-10, 3), Double.MIN_NORMAL);
		// Assert.assertEquals(0d, solution.myPow(0.000001, Integer.MAX_VALUE),
		// Double.MIN_NORMAL);
		// Assert.assertEquals(100d, solution.myPow(10, 2), Double.MIN_NORMAL);
		// Assert.assertEquals(0.01, solution.myPow(10, -2), 0.000001);
	}
}
