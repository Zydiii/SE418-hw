package com.test.mooc.maven;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class WordLadderTest{
	
	@Test
	public void test() {
		WordLadder lad = new WordLadder();
		Stack<String> words = lad.ladder("word", "play", Dictionary.dic);
		assertEquals(7, words.size());
		words = lad.ladder("zythum", "monkey", Dictionary.dic);
		assertEquals(0, words.size());
	}
	
	
}