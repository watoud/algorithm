package net.watoud.learn.algorithm.leetcode;

public class ExcelSheetColumnNumber
{
	public int titleToNumber(String s)
	{
		if (s == null || s.length() == 0)
		{
			return 0;
		}

		int[] dat = new int[] { //
		        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, //
		        11, 12, 13, 14, 15, 16, 17, 18, 19, 20, //
		        21, 22, 23, 24, 25, 26 };

		int base = 1, ir = s.length() - 1, sum = 0;

		while (ir >= 0)
		{
			sum += dat[s.charAt(ir) - 'A'] * base;
			ir--;
			base = base * 26;
		}

		return sum;
	}
}
