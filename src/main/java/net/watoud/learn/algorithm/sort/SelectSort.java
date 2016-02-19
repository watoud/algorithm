/**
 * 
 */
package net.watoud.learn.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lixudong
 *
 */
public class SelectSort
{
	public static void main(String[] args)
	{
		ArrayList<String> original = new ArrayList<String>(
		        Arrays.asList("first", "second", "third"));
		List<String> subList = original.subList(0, original.size());

		original.remove(0);

		System.out.println("subList:" + subList);
	}

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
