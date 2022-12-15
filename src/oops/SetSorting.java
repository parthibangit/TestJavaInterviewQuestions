package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSorting {

	public static void main(String[] args) 
	{
		String[] array={"Parthiban", "Sarathi", "Sarathi", "Parthi", "Parthiban", "Sarathi"};
		System.out.println(Arrays.toString(array));
		
		List<String> listValue=new ArrayList<String>();
		for(String value:array)
		{
			listValue.add(value);
		}
		
		 int count=0;
		
		Collections.sort(listValue);
		System.out.println("Sorted value is: "+listValue);
		Set<String> setValue=new HashSet<>();
		for(int i=1;i<listValue.size();i++)
		{
			if(listValue.get(i-1).equals(listValue.get(i)))
			{
				   setValue.add(listValue.get(i));	 
				   count++;
				   System.out.println(count);
			}
		}
	
		System.out.println("Duplicate value is: "+ setValue);
	}

	
	
	
	
	
	
}
