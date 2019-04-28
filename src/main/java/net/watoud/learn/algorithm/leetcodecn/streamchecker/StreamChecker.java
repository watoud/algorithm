package net.watoud.learn.algorithm.leetcodecn.streamchecker;

/**
 * ������������ڽ�ʡ�ռ�</br>
 * ���Կ���һ�����ݽṹ�������ѯ��������������ѯ����ǰ�ַ���֪���ܷ�ƥ��
 * 
 * @author 18033403557
 *
 */
public class StreamChecker
{
	// root�ڵ㲻����valֵ
	TrieNode root = new TrieNode('a');
	// ���ֻ��Ҫ�洢��ǧ���ַ�
	char[] searchCharCache = new char[2000];
	// ѭ��ʹ���ַ��������飬��ʾ��ǰ���Դ洢��λ��
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
