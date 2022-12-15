package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestArray {

	
	
	/*
	 * 
	 * This method is used to reverse the string using collections REVERSE method
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		
       int[] value={5,7,9,11,13};
       
       List<Integer> list=new ArrayList<Integer>();
       
       
       for(int arrValue:value)
       {
    	   list.add(arrValue);
       }
		
       System.out.println("Normal order is: "+list);
	   Collections.reverse(list);
		
	   System.out.println("Reverse order is: "+ list);
	   
	   reverse();
	   //occurance('a');
	}
	
	
	/*
	 * 
	 * This  method is used to reverse the integer using normal for loop
	 * 
	 */
	
	
	
	public static void reverse()
	{

		int[] value={1,2,3,4,5};
		
		int size=value.length;
		
		List<Integer> list=new ArrayList<>();
		
		for (int i = size-1; i >=0; i--) 
		{
		
			   list.add(value[i]);	
		}
		
        System.out.println(list);
        
        
	}

	
	
	/*
	 * 
	 * This method is used to count char for given a string
	 * 
	 */
	
	public static int occurance(char Ch)
	{
		String str="paarthiban";
		char[] arrStr=str.toCharArray();
		int count=0;
		int index=0;
		
		while(index < arrStr.length)
		{
			if(str.charAt(index)==Ch)
			{
			count++;	
			}
			
			index++;
		}
	
		System.out.println(count);
		return count;
	}
}
