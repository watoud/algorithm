package net.watoud.learn.algorithm.leetcode;

/**
 * 
 * @author lixudong
 * 
 *         Given an array of integers, find two numbers such that they add up to
 *         a specific target number.
 * 
 *         The function twoSum should return indices of the two numbers such
 *         that they add up to the target, where index1 must be less than
 *         index2. Please note that your returned answers (both index1 and
 *         index2) are not zero-based.
 * 
 *         You may assume that each input would have exactly one solution.
 * 
 *         Input: numbers={2, 7, 11, 15}, target=9
 *         Output: index1=1, index2=2
 *
 */
public class TwoSum
{

	public int[] twosumMerge(int[] sums, int target)
	{
		if (sums == null || sums.length < 2)
		{
			return null;
		}

		int[] originalInex = new int[sums.length];
		for (int i = 0; i < originalInex.length; i++)
		{
			originalInex[i] = i;
		}
		merge(sums, 0, sums.length - 1, originalInex);

		int f = 0, t = sums.length - 1;
		while (f < t)
		{
			if (sums[f] + sums[t] == target)
			{
				int first = originalInex[f] + 1, end = originalInex[t] + 1;
				if (first > end)
				{
					return new int[] { end, first };
				}
				else
				{
					return new int[] { first, end };
				}
			}
			while (f < t && sums[f] + sums[t] < target)
			{
				f++;
			}

			while (f < t && sums[f] + sums[t] > target)
			{
				t--;
			}
		}

		return null;
	}

	public void merge(int[] sums, int begin, int end, int[] originalInex)
	{
		if (begin >= end)
		{
			return;
		}
		int m = (begin + end) / 2;
		// 请注意，在分治时，不要选择[begin,m-1]和[m,end]
		// (begin+end)/2已经取整了，再取[m,end],可能会导致[m,end]一直不变
		// 从而堆栈溢出
		merge(sums, begin, m, originalInex);
		merge(sums, m + 1, end, originalInex);

		int length = end - begin + 1;
		int[] indexes = new int[length];
		int[] tmp = new int[length];
		int index = 0, index1 = begin, index2 = m + 1;
		while (index1 <= m && index2 <= end)
		{
			while (index1 <= m && sums[index1] <= sums[index2])
			{
				tmp[index] = sums[index1];
				indexes[index] = originalInex[index1];
				index1++;
				index++;
			}

			while (index2 <= end && sums[index1] > sums[index2])
			{
				tmp[index] = sums[index2];
				indexes[index] = originalInex[index2];
				index2++;
				index++;
			}
		}

		while (index1 <= m)
		{
			tmp[index] = sums[index1];
			indexes[index] = originalInex[index1];
			index1++;
			index++;
		}

		while (index2 <= end)
		{
			tmp[index] = sums[index2];
			indexes[index] = originalInex[index2];
			index2++;
			index++;
		}

		for (int i = 0; i < length; i++)
		{
			sums[begin + i] = tmp[i];
			originalInex[begin + i] = indexes[i];
		}
	}

	public int[] twosumForce(int[] sums, int target)
	{
		if (sums == null || sums.length < 2)
		{
			return null;
		}

		for (int i = 0; i < sums.length; i++)
		{
			for (int j = i + 1; j < sums.length; j++)
			{
				if (sums[i] + sums[j] == target)
				{
					return new int[] { i + 1, j + 1 };
				}
			}
		}
		return null;
	}
}
