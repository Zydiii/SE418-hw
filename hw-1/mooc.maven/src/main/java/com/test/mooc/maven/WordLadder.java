package com.test.mooc.maven;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class WordLadder{
    
	public Stack<String> ladder(String word1, String word2, Set<String> dic) {
		Queue<Stack<String>> ladder =new LinkedList<Stack<String>>();
		Stack<String> first = new Stack<String>();
		first.push(word1);
		ladder.offer(first);
		Set<String> pre_words = new HashSet<String>();
		pre_words.add(word1);
		Stack<String> words = new Stack<String>();
		int len = word1.length();
		while (true)
		{
			Stack<String> _last = ladder.poll();
			String pre = _last.peek();
			for (int i = 0; i < len; i++)
			{
				for (char j = 'a'; j <= 'z'; j++)
				{
					String change_word = pre;
					String new_word = change_word.substring(0, i) + j + change_word.substring(i+1, word1.length());
					change_word = new_word;
					if (Dictionary.check(change_word, dic)==1 && Dictionary.check(change_word, pre_words)==0)
					{
						Stack<String> _new = (Stack<String>) _last.clone();
						_new.push(change_word);
						ladder.offer(_new);
						pre_words.add(change_word);
					}
					if (change_word.equals(word2))
					{
						while(ladder.size() > 1) {
							ladder.poll();
						}
						words = ladder.peek();
						return words;
					}
				}
			}
			if (ladder.size() == 0)
				return words;
	 }
   }
}