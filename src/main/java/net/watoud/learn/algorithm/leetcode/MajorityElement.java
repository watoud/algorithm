package net.watoud.learn.algorithm.leetcode;

public class MajorityElement
{
	public int majorityElement(int[] nums)
	{
		int val = 0, count = 0;

		for (int e : nums)
		{
			if (count == 0)
			{
				val = e;
				count++;
			}
			else if (val != e)
			{
				count--;
			}
			else
			{
				count++;
			}
		}

		return val;
	}

}
