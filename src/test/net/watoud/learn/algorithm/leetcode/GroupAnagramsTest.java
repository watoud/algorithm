/**
 * GroupAnagramsTest.java
 * 2015Äê10ÔÂ16ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class GroupAnagramsTest
{
	@Test
	public void testGroupAnagrams()
	{
		GroupAnagrams sol = new GroupAnagrams();

		System.out.println(sol.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat",
		        "bat" }));

	}
}
