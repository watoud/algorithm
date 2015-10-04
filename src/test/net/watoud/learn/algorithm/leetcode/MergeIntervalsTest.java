/**
 * MergeIntervalsTest.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class MergeIntervalsTest
{
	@Test
	public void testMerge2()
	{
		List<Interval> input = new ArrayList<Interval>();
		MergeIntervals solution = new MergeIntervals();
		List<Interval> result = new ArrayList<Interval>();

		// [[4,4],[3,5],[2,3],[1,1],[3,3],[1,3],[2,2],[0,0],[5,5],[0,0],[4,6]]
		input = new ArrayList<Interval>();
		input.add(new Interval(4, 4));
		input.add(new Interval(3, 5));
		input.add(new Interval(2, 3));
		input.add(new Interval(1, 1));
		input.add(new Interval(3, 3));
		input.add(new Interval(1, 3));
		input.add(new Interval(2, 2));
		input.add(new Interval(0, 0));
		input.add(new Interval(5, 5));
		input.add(new Interval(0, 0));
		input.add(new Interval(4, 6));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[0,0] [1,6] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(2, 3));
		input.add(new Interval(5, 5));
		input.add(new Interval(2, 2));
		input.add(new Interval(3, 4));
		input.add(new Interval(3, 4));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[2,4] [5,5] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 2));
		input.add(new Interval(3, 4));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[1,2] [3,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 4));
		input.add(new Interval(4, 4));
		input.add(new Interval(5, 6));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[1,4] [5,6] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 1));
		input.add(new Interval(1, 4));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 4));
		input.add(new Interval(4, 4));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 4));
		input.add(new Interval(1, 1));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 4));
		input.add(new Interval(0, 0));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[0,0] [1,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 2));
		input.add(new Interval(2, 4));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 2));
		input.add(new Interval(3, 4));
		result = solution.merge(input);
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[1,2] [3,4] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 3));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,3] ", print(result));

		input = new ArrayList<Interval>();
		input.add(new Interval(1, 2));
		result = solution.merge(input);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("[1,2] ", print(result));

	}

	@Test
	public void testMerge()
	{
		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1, 3));
		input.add(new Interval(2, 6));
		input.add(new Interval(8, 10));
		input.add(new Interval(15, 18));

		MergeIntervals solution = new MergeIntervals();

		List<Interval> result = solution.merge(input);
		Assert.assertEquals(3, result.size());
		Assert.assertEquals("[1,6] [8,10] [15,18] ", print(result));
	}

	public String print(List<Interval> values)
	{
		StringBuilder builder = new StringBuilder();
		for (Interval v : values)
		{
			builder.append("[").append(v.start).append(",").append(v.end).append("] ");
		}
		return builder.toString();
	}
}
