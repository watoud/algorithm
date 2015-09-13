/**
 * LongestPalindromicSubstringTest.java
 * 2015Äê9ÔÂ11ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class LongestPalindromicSubstringTest
{
	@Test
	public void testLongestPalindrome()
	{
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
		Assert.assertEquals("12321", solution.longestPalindrome("12321"));
		Assert.assertEquals("1", solution.longestPalindrome("1"));
		Assert.assertEquals("12321", solution.longestPalindrome("sde12321"));
		Assert.assertEquals("11", solution.longestPalindrome("112"));
		Assert.assertEquals("1111111111111", solution.longestPalindrome("1111111111111"));
		Assert.assertEquals("12321", solution.longestPalindrome("012321345"));
		Assert.assertEquals("12321", solution.longestPalindrome("0hgt123213"));
	}
}
