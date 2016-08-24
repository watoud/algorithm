package net.watoud.learn.algorithm.leetcode.dp;

public class DungeonGame
{
	public int calculateMinimumHP(int[][] dungeon)
	{
		int row = dungeon.length, col = dungeon[0].length;
		int[][] minHp = new int[row][col];

		minHp[row - 1][col - 1] = Math.max(1, 1 - dungeon[row - 1][col - 1]);

		for (int i = row - 2; i >= 0; i--)
		{
			minHp[i][col - 1] = Math.max(1, minHp[i + 1][col - 1] - dungeon[i][col - 1]);
		}

		for (int i = col - 2; i >= 0; i--)
		{
			minHp[row - 1][i] = Math.max(1, minHp[row - 1][i + 1] - dungeon[row - 1][i]);
		}

		for (int i = row - 2; i >= 0; i--)
		{
			for (int j = col - 2; j >= 0; j--)
			{
				int ud = Math.max(1, minHp[i + 1][j] - dungeon[i][j]);
				int lr = Math.max(1, minHp[i][j + 1] - dungeon[i][j]);
				minHp[i][j] = Math.min(ud, lr);
			}
		}

		return minHp[0][0];
	}
}
