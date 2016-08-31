package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII
{
	public List<TreeNode> generateTrees(int n)
	{
		if (n <= 0)
		{
			return new ArrayList<>();
		}

		List<List<TreeNode>> dat = new ArrayList<>(n + 1);
		for (int i = 0; i <= n; i++)
		{
			dat.add(null);
		}

		List<TreeNode> f = new ArrayList<>();
		f.add(new TreeNode(1));
		dat.set(1, f);
		dat.set(0, new ArrayList<>());

		for (int i = 2; i <= n; i++)
		{
			List<TreeNode> tmp = new ArrayList<>();
			for (int j = 1; j < i - 1; j++)
			{
				List<TreeNode> bf = dat.get(j);
				List<TreeNode> bt = dat.get(i - 1 - j);

				for (int x = 0; x < bf.size(); x++)
				{
					for (int y = 0; y < bt.size(); y++)
					{
						TreeNode froot = copy(bf.get(x), 0);
						TreeNode troot = copy(bt.get(y), j);

						TreeNode cur = froot;
						while (cur.right != null)
						{
							cur = cur.right;
						}
						TreeNode m = new TreeNode(i);

						cur.right = m;
						m.left = troot;
						tmp.add(froot);
					}
				}
			}

			List<TreeNode> l = dat.get(i - 1);
			for (int j = 0; j < l.size(); j++)
			{
				TreeNode zz = copy(l.get(j), 0);
				TreeNode root = new TreeNode(i);
				root.left = zz;
				tmp.add(root);

				root = new TreeNode(i);
				zz = copy(l.get(j), 0);
				TreeNode cur = zz;
				while (cur.right != null)
				{
					cur = cur.right;
				}

				cur.right = root;
				tmp.add(zz);
			}
			dat.set(i, tmp);
		}

		return dat.get(n);
	}

	private TreeNode copy(TreeNode root, int base)
	{
		TreeNode r = new TreeNode(root.val + base);

		if (root.left != null)
		{
			r.left = copy(root.left, base);
		}

		if (root.right != null)
		{
			r.right = copy(root.right, base);
		}

		return r;
	}
}
