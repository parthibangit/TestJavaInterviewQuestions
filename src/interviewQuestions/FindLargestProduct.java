package interviewQuestions;

public class FindLargestProduct {

	/*
	 * Given an array of integers, 
	 * find the pair of adjacent elements that has the largest product and return that product.
	 */
	
	
	
	public static void main(String[] args) 
	{
	
		int[] array={5, 1, 2, 3, 1, 4};
		
		int max=array[0]*array[1];
		
		for(int i=2; i<array.length;i++)
		{
			
			if(max<array[i-1]*array[i])
			{
				max=array[i-1]*array[i];
			}
			
		}
		
		System.out.println(max);
	}

}
