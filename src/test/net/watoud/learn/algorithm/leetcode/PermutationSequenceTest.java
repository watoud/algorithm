/**
 * PermutationSequenceTest.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class PermutationSequenceTest
{
	@Test
	public void testGetPermutation()
	{
		PermutationSequence solution = new PermutationSequence();
		Assert.assertEquals("21", solution.getPermutation(2, 2));
		Assert.assertEquals("1", solution.getPermutation(1, 1));
		Assert.assertEquals("132", solution.getPermutation(3, 2));
		Assert.assertEquals("231", solution.getPermutation(3, 4));
		Assert.assertEquals("321", solution.getPermutation(3, 6));
		Assert.assertEquals("123", solution.getPermutation(3, 1));
		Assert.assertEquals("132", solution.getPermutation(3, 2));
		Assert.assertEquals("231", solution.getPermutation(3, 4));
		Assert.assertEquals("312", solution.getPermutation(3, 5));
		Assert.assertEquals("321", solution.getPermutation(3, 6));
	}

	@Test
	public void tesPpermutationCount()
	{
		PermutationSequence solution = new PermutationSequence();
		Assert.assertEquals(1, solution.perm(1));
		Assert.assertEquals(6, solution.perm(3));
		Assert.assertEquals(24, solution.perm(4));
	}
}
