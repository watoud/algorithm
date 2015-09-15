/**
 * PalindromeNumberTest.java
 * 2015Äê9ÔÂ15ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class PalindromeNumberTest
{
	@Test
	public void testIsPalindrome1()
	{
		PalindromeNumber solutiuon = new PalindromeNumber();

		Assert.assertFalse(solutiuon.isPalindrome1(-1));
		Assert.assertFalse(solutiuon.isPalindrome1(23));
		Assert.assertTrue(solutiuon.isPalindrome1(0));
		Assert.assertTrue(solutiuon.isPalindrome1(2));
		Assert.assertTrue(solutiuon.isPalindrome1(121));
		Assert.assertTrue(solutiuon.isPalindrome1(11));
		Assert.assertTrue(solutiuon.isPalindrome1(1221));

	}

	@Test
	public void testIsPalindrome2()
	{
		PalindromeNumber solutiuon = new PalindromeNumber();

		Assert.assertFalse(solutiuon.isPalindrome2(1000021));
		Assert.assertTrue(solutiuon.isPalindrome2(1410110141));
		Assert.assertFalse(solutiuon.isPalindrome2(10));
		Assert.assertFalse(solutiuon.isPalindrome2(1000021));
		Assert.assertFalse(solutiuon.isPalindrome2(23));
		Assert.assertTrue(solutiuon.isPalindrome2(0));
		Assert.assertTrue(solutiuon.isPalindrome2(2));
		Assert.assertTrue(solutiuon.isPalindrome2(121));
		Assert.assertTrue(solutiuon.isPalindrome2(11));
		Assert.assertTrue(solutiuon.isPalindrome2(1221));
		Assert.assertTrue(solutiuon.isPalindrome2(12321));
		Assert.assertTrue(solutiuon.isPalindrome2(123321));
		Assert.assertTrue(solutiuon.isPalindrome2(1233321));
	}

	@Test
	public void testTargetBitValue()
	{
		PalindromeNumber solutiuon = new PalindromeNumber();
		Assert.assertEquals(1, solutiuon.targetBitValue(1410110141, 10));
		Assert.assertEquals(1, solutiuon.targetBitValue(1410110141, 1));
		Assert.assertEquals(0, solutiuon.targetBitValue(100, 1));
		Assert.assertEquals(0, solutiuon.targetBitValue(100, 2));
		Assert.assertEquals(1, solutiuon.targetBitValue(100, 3));

	}
}
