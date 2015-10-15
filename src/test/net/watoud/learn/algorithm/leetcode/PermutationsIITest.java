/**
 * PermutationsIITest.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class PermutationsIITest
{
	@Test
	public void testPermute()
	{
		PermutationsII sol = new PermutationsII();
		List<List<Integer>> result = null;

		result = sol.permuteUnique(new int[] { 3, 3, 0, 0, 2, 3, 2 });
		System.out.println(result.size());
		System.out.println(result);

		result = sol.permuteUnique(new int[] { 1, 2, 2, 3 });
		System.out.println(result.size());
		System.out.println(result);

		result = sol.permuteUnique(new int[] { 1, 1, 2 });
		System.out.println(result);
		Assert.assertEquals(3, result.size());

		result = sol.permuteUnique(new int[] { 1, 1 });
		System.out.println(result);
		Assert.assertEquals(1, result.size());

	}
}
