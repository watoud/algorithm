/**
 * GenerateParenthesesTest.java
 * 2015Äê9ÔÂ27ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.List;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class GenerateParenthesesTest
{
	@Test
	public void testGenerateParenthesis()
	{
		GenerateParentheses solution = new GenerateParentheses();
		List<String> result = solution.generateParenthesis(3);
		Assert.assertThat(result,
		        IsCollectionContaining.hasItems("((()))", "(())()", "(()())", "()()()", "()(())"));

		result = solution.generateParenthesis(1);
		Assert.assertThat(result, IsCollectionContaining.hasItems("()"));

		result = solution.generateParenthesis(6);
		System.out.println(result);
		// Assert.assertThat(result,
		// IsCollectionContaining.hasItems("((()))", "(())()", "(()())",
		// "()()()", "()(())"));
	}

	@Test
	public void testSwap()
	{
		GenerateParentheses solution = new GenerateParentheses();

		char[] arr = new char[] { '2', '5', '6' };
		Assert.assertEquals('5', arr[1]);
		Assert.assertEquals('6', arr[2]);
		solution.swap(arr, 1, 2);
		Assert.assertEquals('6', arr[1]);
		Assert.assertEquals('5', arr[2]);
	}
}
