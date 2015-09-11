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
	}

	@Test
	public void testIsPalindromic()
	{
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
		Assert.assertTrue(solution.isPalindromic("1234321", 0, 6));
		Assert.assertTrue(solution.isPalindromic("1", 0, 0));
		Assert.assertFalse(solution.isPalindromic("1234321", 0, 4));
		Assert.assertTrue(solution.isPalindromic("1234321", 1, 5));
		Assert.assertTrue(solution.isPalindromic("1bc1234321", 3, 9));
	}
}
