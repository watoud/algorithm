/**
 * RotateImage.java
 * 2015Äê10ÔÂ18ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author lixudong
 *
 */
public class RotateImage
{
	public static void main(String[] args)
	{

		RotateImage sol = new RotateImage();
		int[][] matrix = null;

		matrix = new int[][] { { 1, 2 }, { 3, 4 } };
		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");

		sol.rotate(matrix);

		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");

		matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");

		sol.rotate(matrix);

		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");

		matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
		        { 13, 14, 15, 16 } };
		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");

		sol.rotate(matrix);

		for (int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-------------");
	}

	public void rotate(int[][] matrix)
	{
		if (matrix == null)
		{
			return;
		}

		int size = matrix.length, round = 0;

		while (round <= (size - 1) / 2)
		{
			for (int i = round; i < size - round - 1; i++)
			{
				int tmp = matrix[round][i];
				matrix[round][i] = matrix[size - 1 - i][round];
				matrix[size - 1 - i][round] = matrix[size - 1 - round][size - 1 - i];
				matrix[size - 1 - round][size - 1 - i] = matrix[i][size - 1 - round];
				matrix[i][size - 1 - round] = tmp;
			}
			round++;
		}
	}
}
