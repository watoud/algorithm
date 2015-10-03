/**
 * InsertInterval.java
 * 2015年9月30日
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lixudong
 * 
  	Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

    You may assume that the intervals were initially sorted according to their start times.
    
    Example 1:
    Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
    
    Example 2:
    Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
    
    This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
    
 */
public class InsertInterval
{
	public List<Interval> insert(List<Interval> intervals, Interval newInterval)
	{
		if (intervals == null || intervals.isEmpty())
		{
			return newInterval == null ? new ArrayList<Interval>() : Arrays.asList(newInterval);
		}

		if (newInterval == null)
		{
			return intervals;
		}

		List<Interval> result = new ArrayList<Interval>();

		for (Interval val : intervals)
		{
			if (newInterval == null)
			{
				result.add(val);
				continue;
			}

			// 【1】完全在左端，相当于新增一个独立的区间
			if (val.start > newInterval.end)
			{
				result.add(newInterval);
				result.add(val);
				newInterval = null;
			}
			// 【2】新区间刚好在左边并可以合并
			else if (val.start == newInterval.end)
			{
				newInterval.end = val.end;
				result.add(newInterval);
				newInterval = null;
			}
			// 【3】新区间完全在右端
			else if (val.end < newInterval.start)
			{
				result.add(val);
			}
			// 【4】新区间完全在右端且可以合并
			else if (val.end == newInterval.start)
			{
				newInterval.start = val.start;
			}
			// 【4】新旧区间有重合
			else
			{
				newInterval.start = Math.min(newInterval.start, val.start);
				newInterval.end = Math.max(newInterval.end, val.end);
			}
		}

		if (newInterval != null)
		{
			result.add(newInterval);
		}

		return result;
	}
}
