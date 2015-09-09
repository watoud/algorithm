/**
 * 
 */
package net.watoud.learn.algorithm.sort;

/**
 * @author lixudong
 *
 */
public class SelectSort
{
	public void sort(int[] arr)
	{
		if (arr == null || arr.length <= 1)
		{
			return;
		}

		for (int i = 0; i < arr.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[index])
				{
					index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
	}
}
