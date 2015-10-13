/**
 * PermutationsTest.java
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
public class PermutationsTest
{
	@Test
	public void testPermute()
	{
		Permutations sol = new Permutations();
		List<List<Integer>> result = null;

		result = sol.permute(new int[] { 1 });
		Assert.assertEquals(1, result.size());
		System.out.println(sol.permute(new int[] { 1, 2 }));
		System.out.println(sol.permute(new int[] { 1 }));
		System.out.println(sol.permute(new int[] { 1, 2, 3, 4 }).size());
		System.out.println(sol.permute(new int[] { 1, 2, 3, 4 }));
		System.out.println(sol.permute(new int[] { 1, 2, 3 }));
	}
}
