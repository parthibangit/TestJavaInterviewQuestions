package oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Set {

//	public static void main(String[] args) 
//	{
//		
//		java.util.Set<Integer> set=new HashSet<Integer>();
//		set.add(2);
//		set.add(1);
//		set.add(3);
//		
//		System.out.println(set);
//	
//	}

	public static void main(String[] args)
	{
		Map<String, String> map=new HashMap<String, String>();
		map.put("First Name", "Parthiban");
		map.put("Last Name", "Subburam");
		
		for(Map.Entry<String, String> value:map.entrySet())
		{
			System.out.println(value.getKey() +": "+ value.getValue());
			
		}
		
		
		map.putIfAbsent("Employer", "Siam computing");
		
		for(Map.Entry<String, String> value:map.entrySet())
		{
			System.out.println(value.getKey() +": "+ value.getValue());
			
		}
		
	}
	
	
	
	
}
