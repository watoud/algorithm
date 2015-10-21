/**
 * LongestCommonPrefixTest.java
 * 2015Äê10ÔÂ21ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class LongestCommonPrefixTest
{
	@Test
	public void testLongestCommonPrefix()
	{
		LongestCommonPrefix sol = new LongestCommonPrefix();

		Assert.assertEquals("1", sol.longestCommonPrefix(new String[] { "12", "123", "1rtr" }));
		Assert.assertEquals("1", sol.longestCommonPrefix(new String[] { "12", "123", "1" }));
		Assert.assertEquals("1", sol.longestCommonPrefix(new String[] { "12", "123", "1" }));
		Assert.assertEquals("", sol.longestCommonPrefix(new String[] { "12", "" }));
		Assert.assertEquals("", sol.longestCommonPrefix(new String[] {}));
	}
}
