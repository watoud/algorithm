/**
 * MedianofTwoSortedArrays.java
 * 2015Äê9ÔÂ16ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class MedianofTwoSortedArrays
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		if (nums1 == null && nums2 == null)
		{
			return 0;
		}

		if (nums1 == null)
		{
			if (nums2.length == 0)
			{
				return 0;
			}

			if (nums2.length % 2 == 0)
			{
				return (double) (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2;
			}
			else
			{
				return nums2[nums2.length / 2];
			}
		}

		if (nums2 == null)
		{
			if (nums1.length == 0)
			{
				return 0;
			}

			if (nums1.length % 2 == 0)
			{
				return (double) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2;
			}
			else
			{
				return nums1[nums1.length / 2];
			}
		}

		int m = nums1.length;
		int n = nums2.length;
		if ((m + n) % 2 != 0)
		{
			return findKth(nums1, nums2, (m + n) / 2, 0, m - 1, 0, n - 1);
		}
		else
		{
			return (findKth(nums1, nums2, (m + n) / 2, 0, m - 1, 0, n - 1) + findKth(nums1, nums2,
			        (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
		}
	}

	private double findKth(int A[], int B[], int k, int aStart, int aEnd, int bStart, int bEnd)
	{
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;

		if (aLen == 0)
			return B[bStart + k];
		if (bLen == 0)
			return A[aStart + k];
		if (k == 0)
			return A[aStart] < B[bStart] ? A[aStart] : B[bStart];

		// int aMid = aLen * k / (aLen + bLen); // a's middle count
		int aMid = Math.min(k / 2, aLen - 1);
		int bMid = Math.min(k - aMid - 1, bLen - 1); // b's middle count

		// make aMid and bMid to be array index
		aMid = aMid + aStart;
		bMid = bMid + bStart;

		if (A[aMid] > B[bMid])
		{
			k = k - (bMid - bStart + 1);
			aEnd = aMid;
			bStart = bMid + 1;
		}
		else
		{
			k = k - (aMid - aStart + 1);
			bEnd = bMid;
			aStart = aMid + 1;
		}

		return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
	}

}
