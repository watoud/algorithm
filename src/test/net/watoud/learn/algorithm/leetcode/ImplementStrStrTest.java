/**
 * ImplementStrStrTest.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ImplementStrStrTest
{
	@Test
	public void testStrStr()
	{
		ImplementStrStr sol = new ImplementStrStr();

		Assert.assertEquals(-1, sol.strStr("12", "123"));
		Assert.assertEquals(4, sol.strStr("1abcd1", "d1"));
		Assert.assertEquals(1, sol.strStr("1abcd1", "abcd"));
		Assert.assertEquals(0, sol.strStr("abcd", "abcd"));
		Assert.assertEquals(2, sol.strStr("12abcd", "abcd"));
		Assert.assertEquals(2, sol.strStr("12abc", "abc"));
		Assert.assertEquals(-1, sol.strStr("12adc", "abc"));
		Assert.assertEquals(-1, sol.strStr(null, "abc"));
	}
}
