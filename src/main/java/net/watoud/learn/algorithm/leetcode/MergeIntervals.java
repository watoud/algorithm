/**
 * MergeIntervals.java
 * 2015年10月5日
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixudong
 * 
 *	Given a collection of intervals, merge all overlapping intervals.

    For example,
    Given [1,3],[2,6],[8,10],[15,18],
    return [1,6],[8,10],[15,18].
    
 */
public class MergeIntervals
{
	// 本方法各种判断条件，并非最好办法；各种边界条件很容易考虑不周到
	public List<Interval> merge(List<Interval> intervals)
	{
		if (intervals == null || intervals.size() == 0)
		{
			return new ArrayList<Interval>();
		}

		List<Interval> result = new ArrayList<Interval>();

		int max = 0;
		for (Interval val : intervals)
		{
			max = Math.max(val.end, max);
		}

		byte[] mapper = new byte[max + 1];
		for (Interval val : intervals)
		{
			if (val.start == val.end)
			{
				if (mapper[val.start] == 0 && (val.start + 1 > max || mapper[val.start + 1] != 1))
				{
					mapper[val.start] = 2;
				}
				continue;
			}

			if (mapper[val.start] == 2)
			{
				mapper[val.start] = 0;
			}

			for (int i = val.start + 1; i <= val.end; i++)
			{
				mapper[i] = 1;
			}
		}

		int i = 0, count = 0;
		while (i <= max)
		{
			if (mapper[i] == 1)
			{
				count++;
			}
			else
			{
				if (count != 0)
				{
					result.add(new Interval(i - count - 1, i - 1));
					count = 0;
				}

				if (mapper[i] == 2)
				{
					result.add(new Interval(i, i));
					mapper[i] = 0;
				}

			}
			i++;
		}

		if (count != 0)
		{
			result.add(new Interval(i - count - 1, i - 1));
		}

		if (mapper[i - 1] == 2)
		{
			result.add(new Interval(i - 1, i - 1));
		}

		return result;
	}
}
