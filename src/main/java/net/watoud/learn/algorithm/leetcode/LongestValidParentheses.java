/**
 * LongestValidParentheses.java
 * 2015Äê10ÔÂ14ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.Stack;

/**
 * @author lixudong
 *
 	Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
    
    For "(()", the longest valid parentheses substring is "()", which has length = 2.
    
    Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

 */
public class LongestValidParentheses
{
	public int longestValidParentheses(String s)
	{
		if (s == null || s.length() < 2)
		{
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();
		int maxLength = 0, matched = 0;
		int count = (s.charAt(0) == ')' ? -1 : 1);
		for (int i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == '(')
			{
				if (s.charAt(i - 1) == ')')
				{
					stack.push(matched);
					count = Math.max(count, 0);
					stack.push(count);
					maxLength = Math.max(maxLength, matched);
					matched = 0;
					count = 0;
				}
				count++;
			}
			else
			{
				count--;
				if (count < 0)
				{
					maxLength = Math.max(maxLength, matched);
					matched = 0;
					count = 0;
					stack.clear();
				}
				else
				{
					matched += 2;
					while (count == 0 && stack.size() > 0)
					{
						count += stack.pop();
						matched += stack.pop();
					}
				}

			}
		}

		return Math.max(maxLength, matched);
	}

}
