package net.watoud.learn.algorithm.leetcode.tree;

import org.junit.Test;

public class BinaryTreeZigzagLevelOrderTraversalTest
{
	@Test
	public void testZigzagLevelOrder()
	{
		BinaryTreeZigzagLevelOrderTraversal sol = new BinaryTreeZigzagLevelOrderTraversal();

		System.out.println(sol.zigzagLevelOrder(TreeUtils.createTreeFromArray(new String[] //
		{ //
		        "3", "9", "20", "X", "X", "15", "7" //
		})));

		System.out.println("==================================");
		System.out.println(sol.zigzagLevelOrder(TreeUtils.createTreeFromArray(new String[] //
		{ //
		        "3", "4", "7", "9", "X", "8", "4" //
		})));

		System.out.println("==================================");
		System.out.println(sol.zigzagLevelOrder(TreeUtils.createTreeFromArray(new String[] //
		{ //
		        "3" //
		})));

		System.out.println("==================================");
		System.out.println(sol.zigzagLevelOrder(TreeUtils.createTreeFromArray(new String[] //
		{ //
		})));
	}
}
