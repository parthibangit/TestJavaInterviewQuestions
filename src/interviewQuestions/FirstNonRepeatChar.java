package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatChar {

	public static void main(String[] args) 
	{
	    
		String s="abcda";
		nonRepeatedchar(s);

	}
	
	
	static char nonRepeatedchar(String s)
	{
		char[] c=s.toCharArray();
		int size=c.length;
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0; i<size; i++)
		{
			
			char min=c[i];
			
			if(!set.contains(min))
			{
				
				map.put(min, i);
			}
			else
			{
				set.add(c[i]);
			}
			
		}
		
		
		char index=0;
		char neg='-';
		char swap =0;
		int minIndex=s.length();
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
	
			if(entry.getValue()<minIndex)
			{
				minIndex=entry.getValue();
			    index=entry.getKey();
			}
				
		}
		
		if(index == 0)
		{
		       swap=neg;
		}
		System.out.println(swap);
		System.out.println(index);
	    return index;
	}
}
