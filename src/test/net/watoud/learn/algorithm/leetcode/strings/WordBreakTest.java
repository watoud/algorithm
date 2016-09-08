package net.watoud.learn.algorithm.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class WordBreakTest
{
	@Test
	public void testWordBreak()
	{
		WordBreak sol = new WordBreak();

		Set<String> words = new HashSet<>();
		words.add("le");
		words.add("leet");
		words.add("code");
		Assert.assertTrue(sol.wordBreak("leetcodele", words));
		Assert.assertTrue(sol.wordBreak(null, words));
		Assert.assertTrue(sol.wordBreak("", words));
		Assert.assertFalse(sol.wordBreak("leetcodelea", words));
	}
}
