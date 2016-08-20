package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest
{
	@Test
	public void testTitleToNumber()
	{
		ExcelSheetColumnNumber sol = new ExcelSheetColumnNumber();

		Assert.assertEquals(28, sol.titleToNumber("AB"));
		Assert.assertEquals(27, sol.titleToNumber("AA"));
		Assert.assertEquals(26, sol.titleToNumber("Z"));
		Assert.assertEquals(0, sol.titleToNumber(null));
		Assert.assertEquals(0, sol.titleToNumber(""));
		Assert.assertEquals(1, sol.titleToNumber("A"));
	}
}
