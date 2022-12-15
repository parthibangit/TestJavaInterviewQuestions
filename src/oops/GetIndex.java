package oops;

import java.util.ArrayList;
import java.util.List;

public class GetIndex {

	public static void main(String[] args) 
	{
		
		List<String> listValue=new ArrayList<String>();
		listValue.add("Test1");
		listValue.add("Test2");
		listValue.add("Test3");
		System.out.println("List value is: "+listValue);
		System.out.println(listValue.get(0));
		
		
		Object indexValue= null;
	    indexValue=listValue.indexOf("Test1");
		System.out.println("Index is: "+indexValue);;
		
		
		
		List<String> listValue1=new ArrayList<String>();
		listValue1.add("Test4");
		listValue1.add("Test5");
		listValue1.add("Test6");
		System.out.println("List 1 value is: "+listValue1);
		for(int i=0;i<listValue1.size();i++)
		{
			String value=listValue1.get((int)indexValue);
			
			if(value.equalsIgnoreCase("test4"))
			{
				System.out.println("value is: "+value);
				break;
			}
			
			
		}
		
		
		
	}

}
