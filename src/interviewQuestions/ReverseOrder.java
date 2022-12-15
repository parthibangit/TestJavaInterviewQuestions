package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOrder {

	// This is for reverse order for a given integer array
	
	public static void main(String[] args) 
	{
		
		
		int[] numbers={3,8,6,3,1,9};
		int size=numbers.length;
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=size-1; i>=0; i--)
		{
			list.add(numbers[i]);
		}
		
		System.out.println(list);
		
		letters();
	}
	
	
	// This is for reverse order for a given string
	
	public static void letters()
	{
		String words="Test new";
		String[] array=words.split("");
		int size=array.length;
		
		List<String> list=new ArrayList<>();
		
		for(int i=size-1; i>=0; i-- )
		{
			list.add(array[i]);
			
		}
		
		String value=String.join("", list);
		System.out.println(value);
			
	}
}
