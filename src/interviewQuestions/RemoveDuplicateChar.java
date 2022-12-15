package interviewQuestions;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar 
{


	public static void main(String[] args) 
	{
		
		String name="call taxi";
		String[] array= name.split("");
		System.out.println("Before removing duplicate character from string: "+ name);
		
		
		LinkedHashSet<String> hash=new LinkedHashSet<String>();
		
		
		for (int i = 0; i < array.length; i++)
		{
		 hash.add(array[i]);	
		}
		
		String string=String.join("", hash);
		System.out.println(string);

	}

}
