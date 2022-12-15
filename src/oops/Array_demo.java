package oops;

public class Array_demo 
{
	
	/*
	 *  This method is used to find the character recursion in words
	 * 
	 */
		
	public static void main(String[] args) 
	{
			frequency("Myywworywyd");  
	}

	
	
	public static void frequency(String word)
	{
		
		char[] char1=word.toCharArray();
		int size=char1.length;
		
		int count=0;
		
		for (int i = 0; i < size; i++) 
		{
		
			
			for (int j = i+1; j < size; j++) 
			{
			
				if (char1[i]==char1[j])
				{
					
					System.out.println(char1[j]);
					count++;
					break;
				}
				
			}
				
			
		}
		
		System.out.println(count);
	}
	
}
