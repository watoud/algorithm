/**
 * ReverseNodesInKGroupTest.java
 * 2015Äê10ÔÂ13ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class ReverseNodesInKGroupTest
{
	@Test
	public void testReverseKGroup()
	{
		ReverseNodesInKGroup sol = new ReverseNodesInKGroup();

		Assert.assertEquals(
		        "2 1 4 3 5 ",
		        ListNodeUtils.print(sol.reverseKGroup(
		                ListNodeUtils.createFromArray(new int[] { 1, 2, 3, 4, 5 }), 2)));

		Assert.assertEquals(
		        "3 2 1 4 5 ",
		        ListNodeUtils.print(sol.reverseKGroup(
		                ListNodeUtils.createFromArray(new int[] { 1, 2, 3, 4, 5 }), 3)));

		Assert.assertEquals(
		        "5 3 1 ",
		        ListNodeUtils.print(sol.reverseKGroup(
		                ListNodeUtils.createFromArray(new int[] { 1, 3, 5 }), 3)));

		Assert.assertEquals(
		        "3 1 5 ",
		        ListNodeUtils.print(sol.reverseKGroup(
		                ListNodeUtils.createFromArray(new int[] { 1, 3, 5 }), 2)));

		Assert.assertEquals(
		        "1 3 5 ",
		        ListNodeUtils.print(sol.reverseKGroup(
		                ListNodeUtils.createFromArray(new int[] { 1, 3, 5 }), 1)));
		Assert.assertEquals(null, sol.reverseKGroup(null, 1));
	}
}
