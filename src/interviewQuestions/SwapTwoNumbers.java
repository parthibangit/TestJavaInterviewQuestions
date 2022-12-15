package interviewQuestions;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{
		
		int a=10,b=50,temp;
		
		System.out.println("Before swapping:");		
		System.out.println("A value is: "+a);
		System.out.println("b value is: "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("");
        System.out.println("After swapping:");		
		System.out.println("A value is: "+a);
		System.out.println("b value is: "+b);
	
		
	}

}
