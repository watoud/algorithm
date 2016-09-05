package net.watoud.learn.algorithm.leetcode.cache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest
{
	@Test
	public void testCache()
	{
		LRUCache cache = new LRUCache(3);

		cache.set(1, 100);
		Assert.assertEquals(100, cache.get(1));
		Assert.assertEquals(-1, cache.get(2));
		cache.set(1, 120);

		Assert.assertEquals(1, cache.size);
		Assert.assertEquals(120, cache.get(1));

		cache.set(30, 333);
		cache.set(90, 999);
		Assert.assertEquals(3, cache.size);

		cache.get(1);
		cache.set(40, 444);

		Assert.assertEquals(3, cache.size);
		Assert.assertEquals(-1, cache.get(30));
	}
}
