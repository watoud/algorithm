/**
 * GroupAnagrams.java
 * 2015Äê10ÔÂ16ÈÕ
 */
package net.watoud.learn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lixudong
 * 
 	Given an array of strings, group anagrams together.
    
    For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
    Return:
    
    [
      ["ate", "eat","tea"],
      ["nat","tan"],
      ["bat"]
    ]
    Note:
    For the return value, each inner list's elements must follow the lexicographic order.
    All inputs will be in lower-case.
    Update (2015-08-09):
    The signature of the function had been updated to return 
    list<list<string>> instead of list<string>, as suggested here. 
    If you still see your function signature return a list<string>,
     please click the reload button  to reset your code definition.
 */
public class GroupAnagrams
{
	public List<List<String>> groupAnagrams(String[] strs)
	{
		if (strs == null || strs.length == 0)
		{
			return new ArrayList<>();
		}

		Arrays.sort(strs);

		Map<String, List<String>> dict = new HashMap<>();
		for (int i = 0; i < strs.length; i++)
		{
			char[] chs = strs[i].toCharArray();
			Arrays.sort(chs);
			String key = String.valueOf(chs);
			List<String> list = dict.get(key);
			if (list == null)
			{
				list = new ArrayList<>();
				dict.put(key, list);
			}
			list.add(strs[i]);
		}

		return new ArrayList<List<String>>(dict.values());
	}
}
