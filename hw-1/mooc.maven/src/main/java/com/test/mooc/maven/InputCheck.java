package com.test.mooc.maven;

public class InputCheck{
	public int wordcheck(String word1, String word2) {
		if (word1.equals(word2)) {
			System.out.println("Word1 and word2 are the same, please enter two different words.\n"); 
			return 0;
		}
		if (word1.length() != word2.length()) {
			System.out.println("Word1 and word2 should be of the same length, please enter two words of the same size.\n");
			return 0;
		}
		   return 1;
	}
}
