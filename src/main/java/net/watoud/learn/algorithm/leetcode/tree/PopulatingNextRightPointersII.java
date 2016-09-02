package net.watoud.learn.algorithm.leetcode.tree;

public class PopulatingNextRightPointersII
{
	public void connect(TreeLinkNode root)
	{
		if (root == null)
		{
			return;
		}
		TreeLinkNode lf = root, cur = null, nf = null;

		while (lf != null)
		{
			cur = lf;
			nf = null;
			while (cur != null)
			{
				if (cur.left != null)
				{
					if (nf != null)
					{
						nf.next = cur.left;
					}

					if (cur.right != null)
					{
						cur.left.next = cur.right;
					}

					if (cur.right != null)
					{
						nf = cur.right;
					}
					else
					{
						nf = cur.left;
					}

				}
				else if (cur.right != null)
				{
					if (nf != null)
					{
						nf.next = cur.right;
					}
					nf = cur.right;
				}

				cur = cur.next;
			}

			while (lf != null)
			{
				if (lf.left != null)
				{
					lf = lf.left;
					break;
				}
				else if (lf.right != null)
				{
					lf = lf.right;
					break;
				}
				else
				{
					lf = lf.next;
				}
			}
		}
	}
}
