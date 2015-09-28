/**
 * RemoveElement.java
 * 2015Äê9ÔÂ28ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class RemoveElement
{
	public int removeElement(int[] nums, int val)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}

		int length = nums.length;
		for (int i = nums.length - 1; i >= 0; i--)
		{
			if (nums[i] == val)
			{
				nums[i] = nums[length - 1];
				length--;
			}
		}

		return length;
	}
}
