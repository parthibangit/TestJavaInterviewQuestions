package oops;

public class FinalKeyword 
{

	final static int a=10;
	
	
	public static void main(String[] args) 
	{

		FinalKeyword.sum();
		
	}

	
	public static void sum()
	{
	    
		int b=10;
		int c=a+b;
		System.out.println("C value is: " + c);
		
	}
	
}
