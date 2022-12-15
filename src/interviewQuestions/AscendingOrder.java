package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {

	
	// This is for ascending order for a given integer array
	
	public static void main(String[] args)
	{
		
      int[] numbers={300,53,15,63,24,85,99};
      List<Integer> list=new ArrayList<Integer>();
      
      for(int value:numbers)
      {
    	  list.add(value);
      }
		
      Collections.sort(list);	
	  System.out.println("Ascending order is: " +list);
	  
      desc();
	}

	
	public static void desc()
	{
		int[] numbers={1,2,3,4,5,6,7,8};
		List<Integer> list=new ArrayList<>();
		
		for(int value:numbers)
		{
			
			list.add(value);
		}
			
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending order is: "+list);
		
	}
				
}
		

