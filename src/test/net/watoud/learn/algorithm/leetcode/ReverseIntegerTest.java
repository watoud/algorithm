/**
 * ReverseIntegerTest.java
 * 2015Äê9ÔÂ14ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ReverseIntegerTest
{
	@Test
	public void testReverse()
	{
		ReverseInteger solution = new ReverseInteger();

		Assert.assertEquals(321, solution.reverse(123));
		Assert.assertEquals(0, solution.reverse(0));
		Assert.assertEquals(-321, solution.reverse(-123));
		Assert.assertEquals(-1, solution.reverse(-1));
		Assert.assertEquals(1, solution.reverse(1));

		Assert.assertEquals(0, solution.reverse(-2147483648));

	}

}
