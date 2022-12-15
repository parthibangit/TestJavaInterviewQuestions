package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccuranceCount {

		
	public static void main(String[] args)
	{
		
		String name="indian";
		String[] string=name.split("");
		
		List<String> list= new ArrayList<String>();
		Set<String> set= new HashSet<String>();
		
		for (int i=0; i<string.length; i++) 
		{
		  
			String min=string[i];
			
			if(set.contains(min))
			{
				list.add(min);
			}
			
			else
			{
				set.add(min);
			}
			
		}
		
		System.out.println(list.size());
	
	}
}
