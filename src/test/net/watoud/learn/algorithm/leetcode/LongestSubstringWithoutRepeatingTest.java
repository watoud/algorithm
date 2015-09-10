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
	public void testLengthOfLongestSubstring()
	{
		LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
		Assert.assertEquals(4, solution.lengthOfLongestSubstring("abcec"));
		Assert.assertEquals(5, solution.lengthOfLongestSubstring("abceC"));
		Assert.assertEquals(1, solution.lengthOfLongestSubstring("aaaaa"));
		Assert.assertEquals(6, solution.lengthOfLongestSubstring("abceAvcx"));
		Assert.assertEquals(2, solution.lengthOfLongestSubstring("ab"));
		Assert.assertEquals(1, solution.lengthOfLongestSubstring("b"));

		Assert.assertEquals(0, solution.lengthOfLongestSubstring(""));
		Assert.assertEquals(0, solution.lengthOfLongestSubstring(null));
		Assert.assertEquals(4, solution.lengthOfLongestSubstring("aaabdcc"));
		Assert.assertEquals(4, solution.lengthOfLongestSubstring("1234"));
		Assert.assertEquals(6, solution.lengthOfLongestSubstring("12344456789990"));
	}
}
