/**
 * SpiralMatrixII.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 */
public class SpiralMatrixII
{
	public int[][] generateMatrix(int n)
	{
		if (n < 0)
		{
			return null;
		}

		if (n == 0)
		{
			return new int[0][0];
		}

		int[][] result = new int[n][n];
		int index = 1, round = 0, k = n;
		int i = 0, j = 0;
		int max = n * n;
		while (k > 0 && index <= max)
		{
			i = j = round;
			while (j < k && index <= max)
			{
				result[i][j] = index;
				j++;
				index++;
			}
			j--;
			i++;

			while (i < k && index <= max)
			{
				result[i][j] = index;
				i++;
				index++;
			}
			i--;
			j--;

			while (j >= round && index <= max)
			{
				result[i][j] = index;
				j--;
				index++;
			}
			j++;
			i--;

			while (i > round && index <= max)
			{
				result[i][j] = index;
				i--;
				index++;
			}

			round++;
			k--;
		}
		return result;
	}
}
