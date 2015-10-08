/**
 * Validarentheses.java
 * 2015Äê10ÔÂ8ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.Stack;

/**
 * @author lixudong
 *
   	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
   	determine if the input string is valid.
    
    The brackets must close in the correct order, 
    "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses
{
	public boolean isValid(String s)
	{

		if (s == null || s.trim().length() == 0)
		{
			return true;
		}

		Stack<Character> result = new Stack<Character>();
		result.add('#');
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
			{
				result.push(s.charAt(i));
			}
			else if (s.charAt(i) == ')')
			{
				if (result.peek() == '(')
				{
					result.pop();
				}
				else
				{
					return false;
				}

			}
			else if (s.charAt(i) == ']')
			{
				if (result.peek() == '[')
				{
					result.pop();
				}
				else
				{
					return false;
				}
			}
			else if (s.charAt(i) == '}')
			{
				if (result.peek() == '{')
				{
					result.pop();
				}
				else
				{
					return false;
				}
			}
		}

		if (result.size() != 1 && result.peek() != '#')
		{
			return false;
		}
		return true;
	}
}
