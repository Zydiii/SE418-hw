package com.test.mooc.maven;

import java.util.Set;
import java.util.Stack;

public class App 
{
    public static void main( String[] args )
    {
        Dictionary dic = new Dictionary();
        Set<String> book = dic.readFile();
        WordLadder lad = new WordLadder();
        String word1 = "aah";
        String word2 = "aal";
        Stack<String> words = lad.ladder(word1, word2, book);
        int len = words.size();
        for(int i =0; i < len; i++) {
        	String s = words.pop();
        	System.out.println(s);
        }
    }
}
