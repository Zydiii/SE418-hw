package com.test.mooc.maven;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class DictionaryTest{
	
	@Test
	public void test() {
		Set<String> book = Dictionary.dic;
		assertEquals(221922, book.size());
		assertEquals(1, Dictionary.check("zythum", book));
		assertEquals(0, Dictionary.check("zzzz", book));
	}
	
	
}