/**
 * JumpGamePerfTest.java
 * 2015Äê9ÔÂ29ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class JumpGamePerfTest
{
	@Test
	public void testCanJump()
	{
		JumpGamePerf solution = new JumpGamePerf();

		Assert.assertTrue(solution.canJump(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
		Assert.assertTrue(solution.canJump(new int[] { 1, 2, 2, 6, 3, 6, 1, 8, 9, 4, 7, 6, 5, 6, 8,
		        2, 6, 1, 3, 6, 6, 6, 3, 2, 4, 9, 4, 5, 9, 8, 2, 2, 1, 6, 1, 6, 2, 2, 6, 1, 8, 6, 8,
		        3, 2, 8, 5, 8, 0, 1, 4, 8, 7, 9, 0, 3, 9, 4, 8, 0, 2, 2, 5, 5, 8, 6, 3, 1, 0, 2, 4,
		        9, 8, 4, 4, 2, 3, 2, 2, 5, 5, 9, 3, 2, 8, 5, 8, 9, 1, 6, 2, 5, 9, 9, 3, 9, 7, 6, 0,
		        7, 8, 7, 8, 8, 3, 5, 0 }));
		Assert.assertTrue(solution.canJump(new int[] { 1 }));
		Assert.assertTrue(solution.canJump(new int[] { 2, 3, 1, 1, 4 }));
		Assert.assertFalse(solution.canJump(new int[] { 3, 2, 1, 0, 4 }));
	}
}
