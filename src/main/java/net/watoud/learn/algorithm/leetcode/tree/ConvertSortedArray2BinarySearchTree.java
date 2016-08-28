package net.watoud.learn.algorithm.leetcode.tree;

public class ConvertSortedArray2BinarySearchTree
{
	public TreeNode sortedArrayToBST(int[] nums)
	{
		if (nums == null)
		{
			return null;
		}

		return sortedArrayToBSTAux(nums, 0, nums.length - 1);
	}

	private TreeNode sortedArrayToBSTAux(int[] dat, int begin, int end)
	{
		if (end < begin)
		{
			return null;
		}

		int m = (begin + end) / 2;
		TreeNode root = new TreeNode(dat[m]);
		root.left = sortedArrayToBSTAux(dat, begin, m - 1);
		root.right = sortedArrayToBSTAux(dat, m + 1, end);
		return root;
	}
}
