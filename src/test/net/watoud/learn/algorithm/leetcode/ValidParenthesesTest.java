/**
 * ValidParenthesesTest.java
 * 2015Äê10ÔÂ8ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ValidParenthesesTest
{
	@Test
	public void testIsValid()
	{
		ValidParentheses solution = new ValidParentheses();

		Assert.assertTrue(solution.isValid("([])"));
		Assert.assertFalse(solution.isValid("("));

		Assert.assertFalse(solution.isValid("([])]"));
		Assert.assertFalse(solution.isValid("([)]"));
		Assert.assertTrue(solution.isValid("()[]{}"));
		Assert.assertTrue(solution.isValid("{}"));
		Assert.assertTrue(solution.isValid("[]"));
		Assert.assertTrue(solution.isValid("()"));
		Assert.assertTrue(solution.isValid(null));
	}
}
