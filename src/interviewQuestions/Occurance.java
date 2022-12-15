package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) 
	{
	
		
		//String numbers="parthibanpp";
		int[] value={1,3,1,6,4,1,3,6};
		//String[] array=numbers.split("");
		
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (Integer c : value) 
		{
		  
			if(map.get(c) != null)
			{
				map.put(c, map.get(c)+1);
			}
			
			else
			{
				map.put(c, 1);
			}
				
		}
		
		System.out.println(map);
		count();
		
	}

	
	public static void count()
	{
		
		String name="partphipbann";
		int size=name.length();
		char ch='p';
		
		int index, count;
		
		index=0;
		count=0;
		
		while(index<size)
		{
			if(name.charAt(index)==ch)
			{
				count++;
			}
			
			index++;
		}
		
		System.out.println(count);				
	}	
}
