package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LargestNumInArray 
{
	
	public static void main(String[] args) 
	{
	
		int[] a={2,5,3,1,9};
		int size=a.length;
		Arrays.sort(a);
		
		List<Integer> list=new ArrayList<Integer>();
	      //List<Integer> list= new LinkedList<>();
		
		for(int b:a)
		{
			list.add(b);
		}
		
		System.out.println(list.get(size-1));
		getSmallest();
	
	}
	
	public static void getSmallest()
	{
		int[] a={2,5,3,1,9};
		//int size=a.length;
		
		List<Integer> list=new ArrayList<Integer>();
		
		Arrays.sort(a);
		
		for(int b:a)
		{
			list.add(b);
		}
		
		System.out.println(list.get(0));
	}
}
