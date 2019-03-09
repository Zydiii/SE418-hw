package com.test.mooc.maven;

import java.util.Stack;

public class OutPut{
	public static void out(Stack<String> words) {
		 int len = words.size();
		 if (len == 0)
			 System.out.println("Sorry, there exists no way between word1 and word2.");
		 else{
			 String s;
			 for(int i =0; i < len - 1; i++) {
		        	s = words.pop();
		        	System.out.println(s);
		        	System.out.println("  =>  ");
		        }
			s = words.pop();
	        System.out.println(s);
		 }
	         
	}
}
