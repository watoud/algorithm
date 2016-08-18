package net.watoud.learn.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber
{
	public String largestNumber(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return "0";
		}

		String[] conv = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			conv[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(conv, new NumberComparator());

		String result = String.join("", conv);

		int i = 0;
		for (; i < result.length(); i++)
		{
			if (result.charAt(i) != '0')
			{
				break;
			}
		}

		if (result.charAt(0) == '0')
		{
			return "0";
		}

		return result;
	}

	public static class NumberComparator implements Comparator<String>
	{

		@Override
		public int compare(String a, String b)
		{
			int index = 0;
			while (index < a.length() && index < b.length())
			{
				if (a.charAt(index) > b.charAt(index))
				{
					return -1;
				}

				if (a.charAt(index) < b.charAt(index))
				{
					return 1;
				}
				index++;
			}

			if (a.length() > b.length())
			{
				return compare(a.substring(index), b);
			}

			if (a.length() < b.length())
			{
				return compare(a, b.substring(index));
			}

			return 0;
		}

	}
}
