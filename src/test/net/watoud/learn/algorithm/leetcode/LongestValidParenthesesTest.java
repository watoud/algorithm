/**
 * LongestValidParenthesesTest.java
 * 2015Äê10ÔÂ14ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class LongestValidParenthesesTest
{
	@Test
	public void testLongestValidParentheses()
	{
		LongestValidParentheses sol = new LongestValidParentheses();

		Assert.assertEquals(4, sol.longestValidParentheses("))))()()))"));
		Assert.assertEquals(4, sol.longestValidParentheses(")()()))"));
		Assert.assertEquals(6, sol.longestValidParentheses("(((((((()))(((((())"));
		Assert.assertEquals(0, sol.longestValidParentheses("(((((((((((((("));
		Assert.assertEquals(2, sol.longestValidParentheses("(()"));
		Assert.assertEquals(2, sol.longestValidParentheses("()("));
		Assert.assertEquals(2, sol.longestValidParentheses("()"));
		Assert.assertEquals(0, sol.longestValidParentheses("("));
		Assert.assertEquals(0, sol.longestValidParentheses(""));
	}
}
