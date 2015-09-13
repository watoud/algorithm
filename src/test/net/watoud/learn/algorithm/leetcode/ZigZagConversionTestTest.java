/**
 * ZigZagConversionTestTest.java
 * 2015��9��13��
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ZigZagConversionTestTest
{
	@Test
	public void testConvert()
	{
		ZigZagConversion solution = new ZigZagConversion();
		// Assert.assertEquals("PAHNAPLSIIGYIR",
		// solution.convert("PAYPALISHIRING", 3));
		Assert.assertEquals("A", solution.convert("A", 1));
		Assert.assertEquals("", solution.convert("", 1));
		Assert.assertEquals("", solution.convert("", 10));
	}
}
