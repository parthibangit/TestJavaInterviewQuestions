package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstDuplicate 
{

	/*
	 * Given an array a that contains only numbers in the range from 1 to a.length, 
	 * find the first duplicate number for which the second occurrence has the minimal index. 
	 * In other words, if there are more than 1 duplicated numbers, 
	 * return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. 
	 * If there are no such elements, return -1.
	 */
	
	
		public static void main(String[] args)  
		{
			 int[] a={3,2,4,3,6,2}; 
		     System.out.println(duplicate(a));
		 }   
		
		
		public static int duplicate(int[] a)
		{
			 Map<Integer, Integer> second = new HashMap<Integer, Integer>();
	         Set<Integer> first = new HashSet<Integer>();
	         for (int i = 0; i < a.length; i++) 
	         {
	            int num = a[i];
	            if (first.contains(num)) 
	            {
	               second.put(num, i);
	            }
	            first.add(num);
	         }
	         
	         int selected = -1;
	         int minIndex = a.length;
	         for (Map.Entry<Integer, Integer> entry : second.entrySet()) 
	         {
	            if (entry.getValue() < minIndex) 
	            {
	               minIndex = entry.getValue();
	               selected = entry.getKey();
	            }
	            
	         }
	           
	         return selected;	
		}		
}
