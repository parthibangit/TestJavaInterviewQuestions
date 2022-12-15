package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class GetAlbhabet
{

	public static void main(String[] args)
	{
		System.out.println("6th position alphabet is: "+getValue("6"));
		
	}
	
	public static String getValue(String userValue)
	{
		String s="abcdefghijklmnopqrstuvwxyz";
		String[] s1=s.split("");
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		for(int i=0; i<s1.length; i++)
		{			
			map.put(i+1, s1[i]);	
		}
		
		System.out.println(map);
		int value1=Integer.parseInt(userValue);
		String value=map.get(value1);
		return value;
	}

}
