package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSumII
{
	public List<List<Integer>> pathSum(TreeNode root, int sum)
	{
		if (root == null)
		{
			return new ArrayList<>();
		}

		Stack<NodeInfo> st = new Stack<>();
		List<List<Integer>> result = new ArrayList<>();

		NodeInfo f = new NodeInfo(root);
		f.trace.add(root.val);
		st.push(f);

		while (!st.empty())
		{
			NodeInfo v = st.pop();
			if (v.node.left == null && v.node.right == null && v.node.val == sum)
			{
				result.add(v.trace);
			}

			if (v.node.left != null)
			{

				NodeInfo info = new NodeInfo(v.node.left);
				info.trace.addAll(v.trace);
				info.trace.add(v.node.left.val);
				v.node.left.val += v.node.val;
				st.push(info);

			}

			if (v.node.right != null)
			{

				NodeInfo info = new NodeInfo(v.node.right);
				info.trace.addAll(v.trace);
				info.trace.add(v.node.right.val);
				v.node.right.val += v.node.val;
				st.push(info);
			}
		}

		return result;
	}

	public static class NodeInfo
	{
		public NodeInfo(TreeNode node)
		{
			this.node = node;
		}

		TreeNode node;
		List<Integer> trace = new ArrayList<>();
	}
}
