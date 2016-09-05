package net.watoud.learn.algorithm.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation
{
	public int evalRPN(String[] tokens)
	{
		if (tokens == null || tokens.length == 0)
		{
			return 0;
		}

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < tokens.length; i++)
		{
			if (tokens[i] == "+")
			{
				st.push(st.pop() + st.pop());
			}
			else if (tokens[i] == "-")
			{
				int a = st.pop();
				int b = st.pop();
				st.push(b - a);
			}
			else if (tokens[i] == "*")
			{
				st.push(st.pop() * st.pop());
			}
			else if (tokens[i] == "/")
			{
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				st.push(b / a);
			}
			else
			{
				st.push(Integer.valueOf(tokens[i]));
			}
		}
		return st.pop();
	}
}
