package net.watoud.learn.algorithm.leetcode.strings;

public class ReverseWordsInAString
{
	public String reverseWords(String s)
	{
		if (s == null || s.length() == 0)
		{
			return s;
		}
		s = s.trim();

		char[] arr = s.toCharArray();

		//
		int count = 0, index = 0, len = arr.length;
		while (index < len)
		{
			if (arr[index] == ' ')
			{
				count++;
			}
			else
			{
				if (count > 1)
				{
					for (int i = index; i < len; i++)
					{
						arr[i - count + 1] = arr[i];
					}
					len = len - count + 1;
					index = index - count + 1;
				}
				count = 0;
			}
			index++;
		}

		if (len != arr.length)
		{
			char[] trimArr = new char[len];
			for (int i = 0; i < len; i++)
			{
				trimArr[i] = arr[i];
			}

			arr = trimArr;
		}

		int begin = 0, end = arr.length - 1;
		while (begin < end)
		{
			char tmp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = tmp;
			begin++;
			end--;
		}

		index = 0;
		while (index < arr.length)
		{
			begin = index;
			while (index < arr.length && arr[index] != ' ')
			{
				index++;
			}

			end = index - 1;
			while (begin < end)
			{
				char tmp = arr[begin];
				arr[begin] = arr[end];
				arr[end] = tmp;
				begin++;
				end--;
			}
			while (index < arr.length && arr[index] == ' ')
			{
				index++;
			}
		}

		return String.valueOf(arr);
	}

}
