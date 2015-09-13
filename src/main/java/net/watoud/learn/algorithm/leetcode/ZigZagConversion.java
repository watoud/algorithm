/**
 * ZigZagConversionTest.java
 * 2015年9月13日
 */
package net.watoud.learn.algorithm.leetcode;

/**
 * @author lixudong
 *         The string "PAYPALISHIRING" is written in a zigzag pattern on a given
 *         number of rows like this: (you may want to display this pattern in a
 *         fixed font for better legibility)
 * 
 *         P   A   H   N
 *         A P L S I I G
 *         Y   I   R
 *         And then read line by line: "PAHNAPLSIIGYIR"
 *         Write the code that will take a string and make this conversion given
 *         a number of rows:
 * 
 *         string convert(string text, int nRows);
 *         convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *         
 *         或者
 *         0     6     E    
 *         1   5 7   D
 *         2 4   8 10 
 *         3     9
 *         
 *         
 *         0       8           16
 *         1     7 9        15
 *         2   6   10    14
 *         3 5	   11 13
 *         4       12
 *         
 *         得出规律，首先zigSize的大小，除了第一行以及最后一行外，中间的行，每一个zigSize有两个字符
 *         依据zigSize来处理
 */
public class ZigZagConversion
{
	public String convert(String s, int numRows)
	{
		if (s == null)
		{
			return null;
		}

		if (s.isEmpty())
		{
			return "";
		}

		if (numRows == 1)
		{
			return s;
		}

		int zigSize = numRows * 2 - 2;
		StringBuilder builder = new StringBuilder();
		int base = 0;
		while (base < s.length())
		{
			builder.append(s.charAt(base));
			base = base + zigSize;
		}

		for (int i = 1; i < numRows - 1; i++)
		{
			base = i;
			while (base < s.length())
			{
				int tmp = (base / zigSize + 1) * zigSize - base % zigSize;
				builder.append(s.charAt(base));
				if (tmp < s.length())
				{
					builder.append(s.charAt(tmp));
				}

				base = base + zigSize;
			}
		}

		if (numRows >= 2)
		{
			base = numRows - 1;
			while (base < s.length())
			{
				builder.append(s.charAt(base));
				base = base + zigSize;
			}
		}

		return builder.toString();
	}
}
