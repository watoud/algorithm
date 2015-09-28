/**
 * RemoveDuplicatesFromSortedArray.java
 * 2015Äê9ÔÂ28ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class RemoveDuplicatesFromSortedArray
{
	public int removeDuplicates(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}

		int length = nums.length;
		int count = 0;
		int i = 1;
		while (i < length)
		{
			if (nums[i - 1] == nums[i])
			{
				i++;
				count++;
			}
			else
			{
				for (int j = i; j < length; j++)
				{
					nums[j - count] = nums[j];
				}
				i = i - count + 1;
				length -= count;
				count = 0;
			}
		}

		if (count != 0)
		{
			length -= count;
		}
		return length;
	}
}
