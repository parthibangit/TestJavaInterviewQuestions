package interviewQuestions;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) 
	{
		
		int[] a={10,20,30,40};
		int sum=0;
	    
		// Use for each to get sum
		for(int b:a)
		{
			sum +=b;
		}
		
		// Use array to get sum
		Arrays.stream(a).sum();
		System.out.println(sum);		
	}
}
