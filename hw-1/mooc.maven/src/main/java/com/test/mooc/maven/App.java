package com.test.mooc.maven;

import java.util.Set;
import java.util.Stack;

public class App 
{
    public static void main( String[] args )
    {
        Dictionary dic = new Dictionary();
        Set<String> book = dic.readFile();
        Input.get(book);
    }
}
