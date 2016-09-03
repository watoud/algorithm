package net.watoud.learn.algorithm.leetcode.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest
{
	@Test
	public void testMinimumTotal()
	{
		Triangle sol = new Triangle();

		List<List<Integer>> in = new ArrayList<>();
		Assert.assertEquals(0, sol.minimumTotal(in));

		in = new ArrayList<>();
		in.add(Arrays.asList(new Integer[] { 2 }));
		Assert.assertEquals(2, sol.minimumTotal(in));

		in = new ArrayList<>();
		in.add(Arrays.asList(new Integer[] { 2 }));
		in.add(Arrays.asList(new Integer[] { 3, 4 }));
		in.add(Arrays.asList(new Integer[] { 6, 5, 7 }));
		Assert.assertEquals(10, sol.minimumTotal(in));

		in = new ArrayList<>();
		in.add(Arrays.asList(new Integer[] { 2 }));
		in.add(Arrays.asList(new Integer[] { 3, 4 }));
		in.add(Arrays.asList(new Integer[] { 6, 5, 7 }));
		in.add(Arrays.asList(new Integer[] { 4, 1, 8, 3 }));
		Assert.assertEquals(11, sol.minimumTotal(in));
	}
}
