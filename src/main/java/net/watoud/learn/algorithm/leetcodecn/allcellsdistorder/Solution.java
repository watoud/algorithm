package net.watoud.learn.algorithm.leetcodecn.allcellsdistorder;

public class Solution
{

	public int[][] allCellsDistOrder(int R, int C, int r0, int c0)
	{
		int length = R * C;
		int[][] result = new int[length][];
		int idx = 0;
		int rr = r0, cc = c0;
		int oo = R + C - 2;
		result[idx++] = new int[]
		{ rr, cc };
		for (int i = 1; i <= oo && idx < length; i++)
		{
			if (cc + i < C)
			{
				result[idx++] = new int[]
				{ rr, cc + i };
			}
			if (cc - i >= 0)
			{
				result[idx++] = new int[]
				{ rr, cc - i };
			}
			if (rr + i < R)
			{
				result[idx++] = new int[]
				{ rr + i, cc };
			}
			if (rr - i >= 0)
			{
				result[idx++] = new int[]
				{ rr - i, cc };
			}
			for (int j = 1; j < i; j++)
			{
				if (rr + j < R && cc + i - j < C)
				{
					result[idx++] = new int[]
					{ rr + j, cc + i - j };
				}
				if (rr + j < R && cc - i + j >= 0)
				{
					result[idx++] = new int[]
					{ rr + j, cc - i + j };
				}
				if (rr - j >= 0 && cc + i - j < C)
				{
					result[idx++] = new int[]
					{ rr - j, cc + i - j };
				}
				if (rr - j >= 0 && cc - i + j >= 0)
				{
					result[idx++] = new int[]
					{ rr - j, cc - i + j };
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution sol = new Solution();
		int[][] result = sol.allCellsDistOrder(1, 2, 0, 0);
		print(result);
		result = sol.allCellsDistOrder(2, 2, 0, 1);
		print(result);
		result = sol.allCellsDistOrder(2, 3, 1, 2);
		print(result);
	}

	static void print(int[][] val)
	{
		System.out.print("[");
		for (int[] inner : val)
		{
			System.out.print("[");
			for (int i = 0; i < inner.length; i++)
			{
				if (i > 0)
				{
					System.out.print(",");
				}
				System.out.print(inner[i]);
			}
			System.out.print("]");
		}
		System.out.print("]");
		System.out.println();
	}

}
