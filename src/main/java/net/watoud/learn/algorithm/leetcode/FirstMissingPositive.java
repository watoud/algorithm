/**
 * FirstMissingPositive.java
 * 2015Äê10ÔÂ23ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class FirstMissingPositive
{
	public static void main(String[] args)
	{
		FirstMissingPositive sol = new FirstMissingPositive();
		System.out.println(sol.firstMissingPositive(new int[] { 1, 1 }));
		System.out.println(sol.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		System.out.println(sol.firstMissingPositive(new int[] { 1, 2, 0 }));
	}

	public int firstMissingPositive(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 1;
		}

		int size = nums.length;
		for (int i = 0; i < size; i++)
		{
			int curV = nums[i];
			while (curV - 1 != i && curV > 0 && curV <= size && curV != nums[curV - 1])
			{
				nums[i] = nums[curV - 1];
				nums[curV - 1] = curV;
				curV = nums[i];
			}
		}

		for (int i = 0; i < size; i++)
		{
			if (nums[i] != i + 1)
			{
				return i + 1;
			}
		}

		return size + 1;
	}
}
