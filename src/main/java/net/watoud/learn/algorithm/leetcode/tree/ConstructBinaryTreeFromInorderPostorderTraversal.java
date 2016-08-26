package net.watoud.learn.algorithm.leetcode.tree;

public class ConstructBinaryTreeFromInorderPostorderTraversal
{
	public TreeNode buildTree(int[] inorder, int[] postorder)
	{

		if (postorder == null || postorder.length == 0 || //
		        inorder == null || inorder.length == 0 || //
		        inorder.length != postorder.length)
		{
			return null;
		}

		return buildTreeAux(inorder, 0, inorder.length - 1, //
		        postorder, 0, postorder.length - 1);

	}

	private TreeNode buildTreeAux(int[] inorder, int ibegin, int iend, //
	        int[] postorder, int pbegin, int pend)
	{
		if (iend < ibegin || pend < pbegin || iend - ibegin != pend - pbegin)
		{
			return null;
		}
		TreeNode root = new TreeNode(postorder[pend]);

		int i = ibegin;
		for (; i <= iend; i++)
		{
			if (inorder[i] == postorder[pend])
			{
				break;
			}
		}

		root.left = buildTreeAux(inorder, ibegin, i - 1, //
		        postorder, pbegin, pbegin + i - ibegin - 1);
		root.right = buildTreeAux(inorder, i + 1, iend, //
		        postorder, pbegin + i - ibegin, pend - 1);
		return root;
	}
}
