package net.watoud.learn.algorithm.leetcode.Triangle;

import org.junit.Assert;
import org.junit.Test;

import net.watoud.learn.algorithm.leetcode.Triangle.PascalTriangle;

public class PascalTriangleTest
{
	@Test
	public void testGenerate()
	{
		PascalTriangle sol = new PascalTriangle();

		System.out.println(sol.generate(10));
		Assert.assertEquals(0, sol.generate(-1).size());
		Assert.assertEquals(5, sol.generate(5).size());
		Assert.assertEquals(0, sol.generate(0).size());
		Assert.assertEquals(1, sol.generate(1).size());
	}
}
