/**
 * ContainerWithMostWater.java
 * 2015Äê10ÔÂ20ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *
 	Given n non-negative integers a1, a2, ..., an, 
 
 	where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

	Note: You may not slant the container.

 *
 */
public class ContainerWithMostWater
{
	public static void main(String[] args)
	{
		ContainerWithMostWater sol = new ContainerWithMostWater();

		System.out.println(sol.maxArea(new int[] { 1, 2 }));
	}

	public int maxArea(int[] height)
	{
		if (height == null || height.length < 2)
		{
			return 0;
		}

		int begin = 0, end = height.length - 1;

		int maxArea = 0;
		while (begin < end)
		{
			int area = Math.min(height[begin], height[end]) * (end - begin);
			maxArea = Math.max(area, maxArea);
			if (height[begin] < height[end])
			{
				int index = begin + 1;
				while (index < end && height[index] <= height[begin])
				{
					index++;
				}
				begin = index;
			}
			else
			{
				int index = end - 1;
				while (index > begin && height[index] <= height[end])
				{
					index--;
				}
				end = index;
			}
		}
		return maxArea;
	}
}
