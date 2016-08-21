package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitleTest
{
	@Test
	public void testConvertToTitle()
	{
		ExcelSheetColumnTitle sol = new ExcelSheetColumnTitle();

		Assert.assertEquals("AZZZ", //
		        sol.convertToTitle(1 * 26 * 26 * 26 + 26 * 26 * 26 + 26 * 26 + 26));

		Assert.assertEquals("ZZZ", //
		        sol.convertToTitle(26 * 26 * 26 + 26 * 26 + 26));

		Assert.assertEquals("AZZ", //
		        sol.convertToTitle(1 * 26 * 26 + 26 * 26 + 26));
		Assert.assertEquals("AZA", //
		        sol.convertToTitle(1 * 26 * 26 + 26 * 26 + 1));
		Assert.assertEquals("AAA", //
		        sol.convertToTitle(1 * 26 * 26 + 1 * 26 + 1));
		Assert.assertEquals("AZ", sol.convertToTitle(52));
		Assert.assertEquals("ZZ", sol.convertToTitle(26 * 27));
		Assert.assertEquals("AA", sol.convertToTitle(27));
		Assert.assertEquals("Z", sol.convertToTitle(26));
		Assert.assertEquals(null, sol.convertToTitle(-1));
		Assert.assertEquals(null, sol.convertToTitle(0));
		Assert.assertEquals("B", sol.convertToTitle(2));
		Assert.assertEquals("A", sol.convertToTitle(1));
	}
}
