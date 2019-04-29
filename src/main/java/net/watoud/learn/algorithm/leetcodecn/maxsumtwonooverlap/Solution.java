package net.watoud.learn.algorithm.leetcodecn.maxsumtwonooverlap;

import java.util.Arrays;

public class Solution
{

	int[] maxSumTowDynamicCache;
	int[] maxSumMDynamicCache;
	int[] maxSumLDynamicCache;

	public int maxSumTwoNoOverlap(int[] A, int L, int M)
	{
		maxSumTowDynamicCache = new int[A.length];
		maxSumMDynamicCache = new int[A.length];
		maxSumLDynamicCache = new int[A.length];
		Arrays.fill(maxSumTowDynamicCache, -1);
		Arrays.fill(maxSumMDynamicCache, -1);
		Arrays.fill(maxSumLDynamicCache, -1);
		return maxSumTwoNoOverlapAux(A, L, M, A.length);
	}

	int maxSumTwoNoOverlapAux(int[] arr, int L, int M, int firstN)
	{
		if (L + M == firstN)
		{
			int sum = 0;
			for (int i = 0; i < firstN; i++)
			{
				sum += arr[i];
			}
			maxSumTowDynamicCache[firstN - 1] = sum;
			return sum;
		}
		int prev = maxSumTowDynamicCache[firstN - 2];
		if (prev < 0)
		{
			prev = maxSumTwoNoOverlapAux(arr, L, M, firstN - 1);
		}
		int sumL = 0;
		for (int i = 0; i < L; i++)
		{
			sumL += arr[firstN - 1 - i];
		}
		int sumotherM = maxNSumContinues(maxSumMDynamicCache, arr, firstN - L, M);
		int sumM = 0;
		for (int i = 0; i < M; i++)
		{
			sumM += arr[firstN - 1 - i];
		}
		int sumotherL = maxNSumContinues(maxSumLDynamicCache, arr, firstN - M, L);
		maxSumTowDynamicCache[firstN - 1] = Math.max(prev,
				Math.max(sumL + sumotherM, sumM + sumotherL));
		return maxSumTowDynamicCache[firstN - 1];
	}

	int maxNSumContinues(int[] dynamicCache, int[] arr, int firstN, int count)
	{
		if (firstN == count)
		{
			int sum = 0;
			for (int i = 0; i < firstN; i++)
			{
				sum += arr[i];
			}
			dynamicCache[firstN - 1] = sum;
			return sum;
		}
		int prev = dynamicCache[firstN - 2];
		if (prev < 0)
		{
			prev = maxNSumContinues(dynamicCache, arr, firstN - 1, count);
		}
		int sum = 0;
		for (int i = 0; i < count; i++)
		{
			sum += arr[firstN - 1 - i];
		}
		dynamicCache[firstN - 1] = Math.max(prev, sum);
		return dynamicCache[firstN - 1];
	}

}
