package com.test.mooc.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputCheckTest{
	
	@Test
	public void test() {
		assertEquals(0, InputCheck.wordcheck("happy", "happy"));
		assertEquals(0, InputCheck.wordcheck("happy", "play"));
		assertEquals(1, InputCheck.wordcheck("word", "play"));
	}
	
	
}