package net.watoud.learn.algorithm.leetcodecn.streamchecker;

/**
 * 本解决方案便于节省空间</br>
 * 可以考虑一种数据结构，方便查询处理，比如做到查询到当前字符就知道能否匹配
 * 
 * @author 18033403557
 *
 */
public class StreamChecker
{
	// root节点不考虑val值
	TrieNode root = new TrieNode('a');
	// 最多只需要存储两千个字符
	char[] searchCharCache = new char[2000];
	// 循环使用字符缓存数组，表示当前可以存储的位置
	int curIndex = 0;
	int queryCount = 0;

	public StreamChecker(String[] words)
	{
		if (words == null || words.length == 0)
		{
			return;
		}
		for (String word : words)
		{
			TrieNode cur = root;
			for (int i = word.length() - 1; i >= 0; --i)
			{
				char ch = word.charAt(i);
				if (cur.children[ch - 'a'] == null)
				{
					TrieNode tmp = new TrieNode(ch);
					cur.children[ch - 'a'] = tmp;
				}
				cur = cur.children[ch - 'a'];
			}
			cur.leaf = true;
		}
	}

	public boolean query(char letter)
	{
		searchCharCache[curIndex++] = letter;
		curIndex %= 2000;
		TrieNode cur = root;
		for (int i = 1; i <= 2000; i++)
		{
			int index = searchCharCache[(curIndex - i + 2000) % 2000] - 'a';
			if (index < 0)
			{
				return false;
			}
			cur = cur.children[index];
			if (cur == null)
			{
				return false;
			}
			if (cur.leaf)
			{
				return true;
			}
		}
		return false;
	}

	class TrieNode
	{
		char val;
		TrieNode[] children;
		boolean leaf;

		TrieNode(char val)
		{
			this.val = val;
			children = new TrieNode[26];
			leaf = false;
		}
	}
}
