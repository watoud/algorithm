/**
 * JumpGamePerf.java
 * 2015Äê9ÔÂ29ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 * 
  	Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.

	Determine if you are able to reach the last index.

	For example:
        A = [2,3,1,1,4], return true.
        
        A = [3,2,1,0,4], return false.
 */

public class JumpGamePerf
{
	public boolean canJump(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return false;
		}

		int gap = 1;
		for (int i = nums.length - 2; i >= 0; i--)
		{
			if (nums[i] >= gap)
			{
				gap = 1;
			}
			else
			{
				gap++;
			}
		}

		if (gap != 1)
		{
			return false;
		}

		return true;
	}
}
