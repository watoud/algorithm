/**
 * JumpGameII.java
 * 2015Äê10ÔÂ18ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 	Given an array of non-negative integers, you are initially positioned at the first index of the array.
    
    Each element in the array represents your maximum jump length at that position.
    
    Your goal is to reach the last index in the minimum number of jumps.
    
    For example:
    Given array A = [2,3,1,1,4]
    
    The minimum number of jumps to reach the last index is 2. 
    
    (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
    
 */
public class JumpGameII
{

	public int jump(int[] nums)
	{
		if (nums == null)
		{
			return -1;
		}

		if (nums.length < 2)
		{
			return 0;
		}

		int size = nums.length;
		int[] steps = new int[size];
		steps[0] = 0;

		for (int i = 0; i < size - 1; i++)
		{
			if (i + nums[i] >= size - 1)
			{
				return steps[i] + 1;
			}

			int index = i + nums[i];
			while (index >= i + 1 && steps[index] == 0)
			{
				steps[index] = steps[i] + 1;
				index--;
			}
		}

		return -1;
	}
}
