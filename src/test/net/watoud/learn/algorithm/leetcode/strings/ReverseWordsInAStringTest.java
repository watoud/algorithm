package net.watoud.learn.algorithm.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest
{
	@Test
	public void testReverseWords()
	{
		ReverseWordsInAString sol = new ReverseWordsInAString();

		Assert.assertEquals("e d c b a", sol.reverseWords("   a   b  c d   e  "));
		Assert.assertEquals("blue is", sol.reverseWords(" is   blue"));
		Assert.assertEquals("blue is", sol.reverseWords(" is blue"));
		Assert.assertEquals("blue is sky the", sol.reverseWords("the sky is blue"));
		Assert.assertEquals("test", sol.reverseWords("test "));
		Assert.assertEquals("test", sol.reverseWords(" test"));
		Assert.assertEquals("a", sol.reverseWords("a"));
		Assert.assertEquals("test", sol.reverseWords("test"));
		Assert.assertEquals("", sol.reverseWords(""));
		Assert.assertEquals("", sol.reverseWords(" "));
		Assert.assertEquals(null, sol.reverseWords(null));
	}
}
