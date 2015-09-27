/**
 * GenerateParentheses2Test.java
 * 2015Äê9ÔÂ28ÈÕ
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
public class GenerateParentheses2Test
{
	@Test
	public void testGenerateParenthesis()
	{
		GenerateParentheses2 solution = new GenerateParentheses2();
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
}
