/**
 * ValidParenthesesTest.java
 * 2015��10��8��
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
