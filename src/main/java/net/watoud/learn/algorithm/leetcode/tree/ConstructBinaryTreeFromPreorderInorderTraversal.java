package net.watoud.learn.algorithm.leetcode.tree;

public class ConstructBinaryTreeFromPreorderInorderTraversal
{
	public TreeNode buildTree(int[] preorder, int[] inorder)
	{
		if (preorder == null || preorder.length == 0 || //
		        inorder == null || inorder.length == 0 || //
		        inorder.length != preorder.length)
		{
			return null;
		}

		return buildTreeAux(preorder, 0, preorder.length - 1, //
		        inorder, 0, inorder.length - 1);
	}

	private TreeNode buildTreeAux(int[] preorder, int pbegin, int pend, //
	        int[] inorder, int ibegin, int iend)
	{
		if (pend < pbegin || iend < ibegin || ibegin - iend != pbegin - pend)
		{
			return null;
		}

		TreeNode root = new TreeNode(preorder[pbegin]);
		int i = ibegin;
		for (; i <= iend; i++)
		{
			if (inorder[i] == preorder[pbegin])
			{
				break;
			}
		}

		root.left = buildTreeAux(preorder, pbegin + 1, pbegin + i - ibegin, //
		        inorder, ibegin, i - 1);
		root.right = buildTreeAux(preorder, pbegin + i - ibegin + 1, pend, //
		        inorder, i + 1, iend);
		return root;
	}
}
