/**
 * PermutationSequence.java
 * 2015年10月5日
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 	The set [1,2,3,…,n] contains a total of n! unique permutations.
    
    By listing and labeling all of the permutations in order,
    We get the following sequence (ie, for n = 3):
    
    "123"
    "132"
    "213"
    "231"
    "312"
    "321"
    Given n and k, return the kth permutation sequence.

 */
public class PermutationSequence
{
	public String getPermutation(int n, int k)
	{
		if (n < 0 || k < 0 || k > perm(n))
		{
			return null;
		}

		int[] result = new int[n];
		for (int i = 0; i < n; i++)
		{
			result[i] = i + 1;
		}

		int remainder = 0, quotient = 0, perm = n - 1;
		while (k > 1 && perm > 0)
		{
			quotient = k / perm(perm);
			remainder = k % perm(perm);
			if (remainder != 0)
			{
				swap(result, n - 1 - perm, n - 1 - perm + quotient);
				sort(result, n - 1 - perm + 1, n - 1);
			}
			else
			{
				swap(result, n - 1 - perm, n - 2 - perm + quotient);
				sort(result, n - 1 - perm + 1, n - 1);
				int begin = n - perm, end = n - 1;
				while (begin < end)
				{
					swap(result, begin, end);
					begin++;
					end--;
				}
			}
			k = remainder;
			perm--;
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++)
		{
			builder.append(result[i]);
		}
		return builder.toString();
	}

	// 对指定部分连续数组选择排序
	public void sort(int[] arr, int a, int b)
	{
		for (int i = a; i <= b; i++)
		{
			int min = i;
			for (int j = i + 1; j <= b; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}

	public void swap(int[] arr, int a, int b)
	{
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	public int perm(int n)
	{
		if (n == 1 || n == 0)
		{
			return 1;
		}
		else
		{
			return n * perm(n - 1);
		}
	}
}
