package com.test.mooc.maven;
import java.util.Scanner;
import java.util.Set;

public class InputWord{
	public static Words getword(Set<String> dic) {
		Words wor = new Words();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
        System.out.println("Word #1:  "); 
        String word1 = sc.nextLine().toLowerCase(); 
		while (Dictionary.check(word1, dic) == 0) {
			System.out.print("Sorry, word1 doesn't exist in the dictionary. ");
			System.out.println("Please try again.");
			System.out.print("Word #1:  "); 
			word1 = sc.nextLine().toLowerCase();		
		}
		wor.word1 = word1;
		System.out.println("Word #2:  "); 
		String word2 = sc.nextLine().toLowerCase(); 
		while (Dictionary.check(word2, dic) == 0) {
			System.out.print("Sorry, word2 doesn't exist in the dictionary.");
			System.out.println("Please try again.");
			System.out.print("Word #2:  "); 
			word2 = sc.nextLine().toLowerCase();		
		}
		wor.word2 = word2;
		return wor;
	}
}
