package net.watoud.learn.algorithm.leetcodecn.nummovesstones;

public class Solution
{
	public static void main(String[] args)
	{
		Solution sol = new Solution();

		print(sol.numMovesStones(1, 4, 20));
	}

	static void print(int[] vs)
	{
		for (int a : vs)
		{
			System.out.println(a + "   ");
		}
	}

	public int[] numMovesStones(int a, int b, int c)
	{
		int x, y, z;// x<y<Z
		if (a < b)
		{
			if (b < c)
			{
				x = a;
				y = b;
				z = c;
			}
			else if (c > a)
			{
				x = a;
				y = c;
				z = b;
			}
			else
			{
				x = c;
				y = a;
				z = b;
			}
		}
		else
		{
			if (a < c)
			{
				x = b;
				y = a;
				z = c;
			}
			else if (b < c)
			{
				x = b;
				y = c;
				z = a;
			}
			else
			{
				x = c;
				y = b;
				z = a;
			}
		}
		int max = z - x - 2;
		return new int[]
		{ numMovesStonesMin(x, y, z), max };
	}

	int numMovesStonesMin(int x, int y, int z)
	{
		if (z - x == 2)
		{
			return 0;
		}
		int lv = y - x - 1;
		int rv = z - y - 1;
		if (lv == 0 || rv == 0 || lv == 1 || rv == 1)
		{
			return 1;
		}
		return 2;
	}
}
