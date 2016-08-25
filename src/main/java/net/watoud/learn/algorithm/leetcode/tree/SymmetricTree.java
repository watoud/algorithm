package net.watoud.learn.algorithm.leetcode.tree;

public class SymmetricTree
{
	public boolean isSymmetric(TreeNode root)
	{
		if (root == null)
		{
			return true;
		}

		return isSymmetricAux(root.left, root.right);
	}

	private boolean isSymmetricAux(TreeNode t1, TreeNode t2)
	{
		if (t1 == null && t2 == null)
		{
			return true;
		}
		if (t1 == null || t2 == null || t2.val != t1.val)
		{
			return false;
		}

		return isSymmetricAux(t1.left, t2.right) && isSymmetricAux(t1.right, t2.left);
	}
}
