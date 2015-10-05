/**
 * SpiralMatrix.java
 * 2015Äê10ÔÂ5ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class SpiralMatrix
{
	public List<Integer> spiralOrder(int[][] matrix)
	{
		if (matrix == null)
		{
			return new ArrayList<>();
		}

		if (matrix.length == 0 || matrix[0].length == 0)
		{
			return new ArrayList<>();
		}

		int row = matrix.length, col = matrix[0].length;
		List<Integer> result = new ArrayList<>();
		int count = 1, maxCount = row * col;
		int rowTmp = row, colTmp = col;
		int round = 0;
		int i = 0, j = 0;

		while (count <= maxCount)
		{
			i = j = round;
			while (j < colTmp && count <= maxCount)
			{
				result.add(matrix[i][j]);
				j++;
				count++;
			}
			j--;
			i++;

			while (i < rowTmp && count <= maxCount)
			{
				result.add(matrix[i][j]);
				i++;
				count++;
			}
			i--;
			j--;

			while (j >= round && count <= maxCount)
			{
				result.add(matrix[i][j]);
				j--;
				count++;
			}
			j++;
			i--;

			while (i > round && count <= maxCount)
			{
				result.add(matrix[i][j]);
				i--;
				count++;
			}

			round++;
			rowTmp--;
			colTmp--;
		}

		return result;
	}
}
