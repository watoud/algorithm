/**
 * InsertIntervalTest.java
 * 2015Äê9ÔÂ30ÈÕ
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
public class InsertIntervalTest
{
	@Test
	public void testPrintAndSort3()
	{
		List<Interval> arr = new ArrayList<Interval>();
		arr.add(new Interval(1, 2));
		arr.add(new Interval(3, 5));
		arr.add(new Interval(6, 7));
		arr.add(new Interval(8, 10));
		arr.add(new Interval(12, 16));

		InsertInterval solution = new InsertInterval();

		List<Interval> result = solution.insert(arr, new Interval(4, 9));
		Assert.assertEquals(3, result.size());
		Assert.assertEquals("[1,2] [3,10] [12,16] ", print(result));
	}

	@Test
	public void testPrintAndSort2()
	{
		List<Interval> arr = new ArrayList<Interval>();
		arr.add(new Interval(1, 3));
		arr.add(new Interval(6, 9));

		InsertInterval solution = new InsertInterval();

		List<Interval> result = solution.insert(arr, new Interval(2, 5));
		Assert.assertEquals(2, result.size());
		Assert.assertEquals("[1,5] [6,9] ", print(result));
	}

	@Test
	public void testPrintAndSort()
	{
		List<Interval> arr = new ArrayList<Interval>();
		arr.add(new Interval(1, 3));
		arr.add(new Interval(5, 7));
		arr.add(new Interval(22, 24));

		InsertInterval solution = new InsertInterval();

		List<Interval> result = solution.insert(arr, new Interval(8, 9));
		Assert.assertEquals(4, result.size());
		Assert.assertEquals("[1,3] [5,7] [8,9] [22,24] ", print(result));
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
