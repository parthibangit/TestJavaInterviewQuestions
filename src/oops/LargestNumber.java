package oops;

public class LargestNumber {

	public static void main(String[] args) 
	{
		
      int[] a={1,2,3,4,5};
      System.out.println(largest(a));
		
		
	}
	
	
	public static int largest(int[] number)
	{
		
		int size=number.length;
		int temp;
		
		for(int i=0; i<size; i++)
		{
			
			
			for (int j = i+1; j < size; j++) 
			{
				
				if(number[i]>number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
				
			}
			
		}
		
		return (size-1);
	}

}
