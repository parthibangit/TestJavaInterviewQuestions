package oops;


public class Sorting 
{

	public static void main(String[] args)
	{
		
		Sorting arraySorting=new Sorting();
		System.out.println("Duplicate value count is: "+arraySorting.arrayValue());
			
		
	}
	
	public int arrayValue()
	{
		
		int[] array={5,5,4,4,7,3,7,7,8,9,5,2};
		final int len=array.length;
	    int count=0;

	    for(int i=0;i<len;i++)
	    {
	        int j=i+1;
	        if(array[i]==array[j])
	        {
	            count++;
	            while((array[i]==array[j]))
	            {
	                if(j==len-1)
	                    break;
	                j++;
	            }  
	        } 
	        i=j-1;
	        if(i==len-2)
	            break;
	    }
	    return count;  
	}
}
