/**
 * JumpGame.java
 * 2015Äê9ÔÂ29ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 *	Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.

	Determine if you are able to reach the last index.

	For example:
        A = [2,3,1,1,4], return true.
        
        A = [3,2,1,0,4], return false.
 */
public class JumpGame
{
	public boolean canJump(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return false;
		}
		return jump(nums, 0);
	}

	private boolean jump(int[] nums, int level)
	{
		if (nums[level] + level >= nums.length - 1)
		{
			return true;
		}

		boolean result = false;
		for (int i = nums[level]; i >= 1; i--)
		{
			result = jump(nums, level + i);
			if (result)
			{
				return true;
			}
		}

		return false;
	}
}
