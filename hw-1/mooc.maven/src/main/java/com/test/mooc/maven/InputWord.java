package com.test.mooc.maven;
import java.util.Scanner;
import java.util.Set;

public class InputWord{
	public static Words getword(Set<String> dic) {
		Words wor = new Words();
		Scanner sc = new Scanner(System.in); 
        System.out.println("Word #1:  "); 
        String word1 = sc.nextLine(); 
		word1.toLowerCase();
		while (Dictionary.check(word1, dic) == 0) {
			System.out.println("Invalid Word"); 
			System.out.println("Word #1:  "); 
			word1 = sc.nextLine();		
			word1.toLowerCase();
		}
		wor.word1 = word1;
		System.out.println("Word #2:  "); 
		String word2 = sc.nextLine(); 
		word2.toLowerCase();
		while (Dictionary.check(word2, dic) == 0) {
			System.out.println("Invalid Word"); 
			System.out.println("Word #2:  "); 
			word2 = sc.nextLine();		
			word2.toLowerCase();
		}
		wor.word2 = word2;
		return wor;
	}
}
