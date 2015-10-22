/**
 * FirstMissingPositiveTest.java
 * 2015Äê10ÔÂ23ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class FirstMissingPositiveTest
{
	@Test
	public void TestFirstMissingPositive()
	{
		FirstMissingPositive sol = new FirstMissingPositive();

		Assert.assertEquals(2, sol.firstMissingPositive(new int[] { 0, 1, 1, 1, 3, 4, 4, 4 }));
		Assert.assertEquals(1, sol.firstMissingPositive(new int[] { 0, 2, 3 }));
		Assert.assertEquals(4, sol.firstMissingPositive(new int[] { 1, 2, 3 }));
		Assert.assertEquals(2, sol.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		Assert.assertEquals(3, sol.firstMissingPositive(new int[] { 1, 2, 0 }));
	}
}
