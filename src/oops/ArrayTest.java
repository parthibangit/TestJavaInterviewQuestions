package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

public class ArrayTest {

	public static void main(String[] args) 
	{
		
	 String str="Iamamaprogrammer";
	 String[] stringArray= str.split("");
	 
	 java.util.HashMap<String, Integer> superMap=new HashMap<>();
	 
	 for (String string : stringArray) 
	 {
		 
		if(superMap.get(string) !=null)
		{
			superMap.put(string, superMap.get(string)+1);
		}
		 
		else
		{ 
		    superMap.put(string, 1);
		}
	 }
		
	 System.out.println(superMap);	
	 listRecursion("I am am a programmer");
	}
	
	
	public static void listRecursion(String word )
	{
		String letter="m";
		String[] strChar=word.split("");
		System.out.println("Given string is: "+Arrays.toString(strChar));
		
		List<String> list=new ArrayList<>();
		
		for (String string : strChar)
		{
		
			list.add(string);		
		}
		
		//Collections.reverse(list);
		System.out.println( letter+ " Recursion in string are: "+ Collections.frequency(list, letter));		
	}
}
