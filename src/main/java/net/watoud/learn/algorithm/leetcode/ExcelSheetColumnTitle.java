package net.watoud.learn.algorithm.leetcode;

public class ExcelSheetColumnTitle
{
	public String convertToTitle(int n)
	{
		if (n <= 0)
		{
			return null;
		}

		char[] dat = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', //
		        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', //
		        'U', 'V', 'W', 'X', 'Y', 'Z' };
		StringBuilder builder = new StringBuilder();

		while (n > 0)
		{
			int r = n % 26;
			builder.append(dat[(r + 25) % 26]);
			n = n / 26 - (r == 0 ? 1 : 0);
		}

		return builder.reverse().toString();
	}
}
