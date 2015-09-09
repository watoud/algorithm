/**
 * LongestSubstringWithoutRepeatingTest.java
 * 2015Äê9ÔÂ9ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class LongestSubstringWithoutRepeatingTest
{
	@Test
	public void testGetIndex()
	{
		LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
		Assert.assertEquals(0, solution.getIndex('a'));
		Assert.assertEquals(25, solution.getIndex('z'));
		Assert.assertEquals(26, solution.getIndex('A'));
		Assert.assertEquals(51, solution.getIndex('Z'));
	}

	@Test
	public void testLengthOfLongestSubstring()
	{
		LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
		Assert.assertEquals(4, solution.lengthOfLongestSubstring("abcec"));
		Assert.assertEquals(5, solution.lengthOfLongestSubstring("abceC"));
		Assert.assertEquals(1, solution.lengthOfLongestSubstring("aaaaa"));
		Assert.assertEquals(6, solution.lengthOfLongestSubstring("abceAvcx"));

		Assert.assertEquals(0, solution.lengthOfLongestSubstring(""));
		Assert.assertEquals(0, solution.lengthOfLongestSubstring(null));
	}
}
