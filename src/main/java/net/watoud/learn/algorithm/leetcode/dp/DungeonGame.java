package net.watoud.learn.algorithm.leetcode.dp;

public class DungeonGame
{
	public int calculateMinimumHP(int[][] dungeon)
	{
		int remain = 1, row = dungeon.length, col = dungeon[0].length;
		int[][] minHp = new int[row][col];
		int[][] curHp = new int[row][col];

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (i == 0 && j == 0)
				{
					if (dungeon[0][0] >= 0)
					{
						// 至少需要一个点的血量
						minHp[0][0] = 1;
						curHp[0][0] = Math.max(1, dungeon[0][0] + 1);
					}
					else
					{
						minHp[0][0] = remain - dungeon[0][0];
						curHp[0][0] = 1;
					}
					continue;
				}

				int upMin = Integer.MAX_VALUE;
				int upCur = Integer.MIN_VALUE;
				// 从上到下
				if (j - 1 >= 0)
				{
					if (dungeon[i][j] + curHp[i][j - 1] >= remain)
					{
						upCur = dungeon[i][j] + curHp[i][j - 1];
						upMin = minHp[i][j - 1];
					}
					else
					{
						upCur = remain;
						upMin = minHp[i][j - 1] + remain - (dungeon[i][j] + curHp[i][j - 1]);
					}
				}

				// 从左到右
				int lrMin = Integer.MAX_VALUE;
				int lrCur = Integer.MIN_VALUE;
				if (i - 1 >= 0)
				{
					if (dungeon[i][j] + curHp[i - 1][j] >= remain)
					{
						lrCur = dungeon[i][j] + curHp[i - 1][j];
						lrMin = minHp[i - 1][j];
					}
					else
					{
						lrCur = remain;
						lrMin = minHp[i - 1][j] + remain - (dungeon[i][j] + curHp[i - 1][j]);
					}
				}

				if (upMin < lrMin)
				{
					minHp[i][j] = upMin;
					curHp[i][j] = upCur;
				}
				else
				{
					minHp[i][j] = lrMin;
					curHp[i][j] = lrCur;
				}
			}
		}

		return minHp[row - 1][col - 1];
	}
}
