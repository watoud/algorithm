/**
 * JumpGameIITest.java
 * 2015Äê10ÔÂ18ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class JumpGameIITest
{
	@Test
	public void testJump()
	{
		JumpGameII sol = new JumpGameII();

		Assert.assertEquals(2, sol.jump(new int[] { 2, 3, 1, 1, 4 }));

		Assert.assertEquals(2, sol.jump(new int[] { 8, 9, 1, 0, 0, 7, 0, 0, 1, 7 }));

		Assert.assertEquals(1, sol.jump(new int[] { 2, 0, 0 }));

		Assert.assertEquals(0, sol.jump(new int[] {}));
		Assert.assertEquals(1, sol.jump(new int[] { 2, 0 }));
		Assert.assertEquals(0, sol.jump(new int[] { 2 }));
		Assert.assertEquals(-1, sol.jump(new int[] { 2, 0, 0, 0, 4 }));

	}
}
