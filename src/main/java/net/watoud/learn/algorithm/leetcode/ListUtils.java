/**
 * ListUtils.java
 * 2015��10��22��
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.List;

/**
 * @author lixudong
 *
 */
public class ListUtils
{
	public static <T> void print(List<List<T>> values)
	{
		for (List<T> v : values)
		{
			System.out.println(v);
		}
	}
}
