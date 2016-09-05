package net.watoud.learn.algorithm.leetcode.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache
{
	int cap;
	int size;
	MList ml;

	Map<Integer, LNode> dat = new HashMap<>();

	public LRUCache(int capacity)
	{
		if (capacity <= 0)
		{
			throw new IllegalArgumentException();
		}
		this.cap = capacity;
		this.size = 0;
		this.ml = new MList();
	}

	public int get(int key)
	{
		LNode val = this.dat.get(key);
		if (val == null)
		{
			return -1;
		}
		else
		{
			this.ml.moveToFirst(val);
			return val.val;
		}
	}

	public void set(int key, int value)
	{
		LNode ele = this.dat.get(key);
		if (ele != null)
		{
			this.ml.remove(ele);
			this.dat.put(key, this.ml.addFirst(key, value));
			return;
		}

		if (this.size >= this.cap)
		{
			LNode del = this.ml.tail.prev;
			this.ml.remove(del);
			this.dat.remove(del.key);

			this.dat.put(key, this.ml.addFirst(key, value));
		}
		else
		{
			this.dat.put(key, this.ml.addFirst(key, value));
			this.size++;
		}
	}

	private static class MList
	{
		LNode head, tail;

		MList()
		{
			head = new LNode();
			tail = new LNode();
			head.next = tail;
			tail.prev = head;
		}

		void moveToFirst(LNode n)
		{
			n.prev.next = n.next;
			n.next.prev = n.prev;

			n.next = head.next;
			head.next.prev = n;
			head.next = n;
			n.prev = head;
		}

		void remove(LNode n)
		{
			n.prev.next = n.next;
			n.next.prev = n.prev;
			n.prev = null;
			n.next = null;
		}

		LNode addFirst(int k, int v)
		{
			LNode n = new LNode(k, v);

			n.next = head.next;
			head.next.prev = n;
			head.next = n;
			n.prev = head;
			return n;
		}
	}

	private static class LNode
	{
		Integer key, val;
		LNode prev, next;

		LNode()
		{
		}

		LNode(int key, int val)
		{
			this.key = key;
			this.val = val;
		}
	}
}
