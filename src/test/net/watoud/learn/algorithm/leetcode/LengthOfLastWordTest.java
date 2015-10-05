/**
 * LengthOfLastWordTest.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class LengthOfLastWordTest
{
	@Test
	public void testLengthOfLastWord()
	{
		LengthOfLastWord solution = new LengthOfLastWord();
		Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
		Assert.assertEquals(5, solution.lengthOfLastWord("Hello World  "));
		Assert.assertEquals(0, solution.lengthOfLastWord("   "));
		Assert.assertEquals(3, solution.lengthOfLastWord("abc"));
	}
}
