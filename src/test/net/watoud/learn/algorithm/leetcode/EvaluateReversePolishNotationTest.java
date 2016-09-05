package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateReversePolishNotationTest
{
	@Test
	public void testEvalRPN()
	{
		EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();

		Assert.assertEquals(0, sol.evalRPN(new String[] { "0", "3", "/" }));
		Assert.assertEquals(2, sol.evalRPN(new String[] { "2" }));
		Assert.assertEquals(0, sol.evalRPN(new String[] {}));

		Assert.assertEquals(9, sol.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
		Assert.assertEquals(6, sol.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
	}
}
