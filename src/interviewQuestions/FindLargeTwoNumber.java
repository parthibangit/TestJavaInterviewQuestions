package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargeTwoNumber 
{

	public static void main(String[] args) 
	{
	
		int[] array={2,5,3,4,8,6};
		int size=array.length;
		Arrays.sort(array);
		List<Integer> list=new ArrayList<Integer>();
		
		
		for(int i=size-1; i>=0 ;i--)
		{
			list.add(array[i]);
			
			if(list.size() == 2)
			{
				System.out.println(list);
				break;
			}
		}	
	}
}
