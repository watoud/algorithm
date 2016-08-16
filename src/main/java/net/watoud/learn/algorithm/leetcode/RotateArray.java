package net.watoud.learn.algorithm.leetcode;

public class RotateArray
{
	public void rotate(int[] nums, int k)
	{
		if (nums == null || nums.length == 0 || k == 0)
		{
			return;
		}

		int len = nums.length, v = k % len;
		if (v < 0)
		{
			v = v + len;
		}
		rotateAux(nums, 0, len - v - 1);
		rotateAux(nums, len - v, len - 1);
		rotateAux(nums, 0, len - 1);
	}

	private void rotateAux(int[] nums, int begin, int end)
	{
		if (begin >= end)
		{
			return;
		}

		while (begin < end)
		{
			int tmp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = tmp;

			begin++;
			end--;
		}
	}

}
