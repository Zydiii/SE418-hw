package com.test.mooc.maven;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Input{
	public static void get(Set<String> dic) {
		System.out.println("Welcome to WordLadder! Enjoy the magic!\n");
		System.out.println("Please enter two words that are of the same length but not as the same.\n");
		while(true) {
			System.out.println("Do you wanna play it? (Enter y or n)");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in); 
	        String decision = sc.nextLine(); 
	        if (decision.equals("n")) {
	        	System.out.println("Thanks for your visiting!");
	        	break;
	        }
	        Words wor = new Words();
	        while (true) {
	        	wor = InputWord.getword(dic);	
				int a = InputCheck.wordcheck(wor.word1, wor.word2);
				if(a == 1)
					break;
	        }
	        WordLadder lad = new WordLadder();
	        Stack<String> words = lad.ladder(wor.word1, wor.word2,dic);
	        OutPut.out(words);
		}
	}
}
