/**
 * NQueensIITest.java
 * 2015Äê10ÔÂ18ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class NQueensIITest
{
	@Test
	public void testTotalNQueens()
	{
		NQueensII sol = new NQueensII();

		Assert.assertEquals(4, sol.totalNQueens(6));
		Assert.assertEquals(40, sol.totalNQueens(7));
		Assert.assertEquals(92, sol.totalNQueens(8));
		Assert.assertEquals(2, sol.totalNQueens(4));
		Assert.assertEquals(1, sol.totalNQueens(1));
		Assert.assertEquals(0, sol.totalNQueens(0));
	}
}
