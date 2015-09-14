/**
 * String2IntegerTest.java
 * 2015Äê9ÔÂ14ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class String2IntegerTest
{
	@Test
	public void testMyAtoi()
	{
		String2Integer solution = new String2Integer();

		Assert.assertEquals(123, solution.myAtoi("123"));
		Assert.assertEquals(0, solution.myAtoi("0"));
		Assert.assertEquals(-123, solution.myAtoi("-123"));
		Assert.assertEquals(0, solution.myAtoi("1d23"));
		Assert.assertEquals(2147483647, solution.myAtoi("2147483647"));
		Assert.assertEquals(0, solution.myAtoi("2147483648"));
		Assert.assertEquals(-2147483648, solution.myAtoi("-2147483648"));
		Assert.assertEquals(0, solution.myAtoi("-2147483649"));

		Assert.assertEquals(0, solution.myAtoi("--2"));
		Assert.assertEquals(0, solution.myAtoi("-+2"));
		Assert.assertEquals(0, solution.myAtoi("+-2"));
		Assert.assertEquals(0, solution.myAtoi("++2"));
		Assert.assertEquals(0, solution.myAtoi("---2"));
		Assert.assertEquals(0, solution.myAtoi("---"));
		Assert.assertEquals(0, solution.myAtoi("-+-2"));

		Assert.assertEquals(110, solution.myAtoi("  0110"));
		Assert.assertEquals(0, solution.myAtoi("  0 110"));

	}
}
