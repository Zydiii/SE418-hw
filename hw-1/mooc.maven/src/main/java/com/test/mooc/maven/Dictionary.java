package com.test.mooc.maven;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
	static Set<String> dic = readFile();
	public static Set<String> readFile() {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		Set<String> hashSet = new HashSet<String>();
		try {
			fis = new FileInputStream("src/main/java/com/test/mooc/maven/dictionary.txt"); 
			isr = new InputStreamReader(fis, "UTF-8"); 
			br = new BufferedReader(isr); 
			String line;
			while ((line = br.readLine()) != null) 
			{
				hashSet.add(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return hashSet;
	}
	
	public static int check(String word, Set<String> hashSet) {
		if (hashSet.contains(word)) {
			return 1;
		}
		else
		   return 0;
	}
}
