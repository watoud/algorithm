/**
 * MaximumSubarray.java
 * 2015Äê10ÔÂ7ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class MaximumSubarray
{
	public int maxSubArray(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}

		int maxSum = Integer.MIN_VALUE;

		int sum = 0;

		for (int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
			if (maxSum < sum)
			{
				maxSum = sum;
			}
			if (sum < 0)
			{

				sum = 0;
			}
		}
		return maxSum;
	}
}
