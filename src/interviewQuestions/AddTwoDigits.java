package interviewQuestions;

public class AddTwoDigits 
{

	/*
	 * You are given a two-digit integer n. Return the sum of its digits.
	 * 
	 */
	

	public static void main(String[] args) 
	{
		
      System.out.println(addTwoDigit(25));
	}
	
	
	static int addTwoDigit(int n)
	{
		return (n%10) + n/10;
	}
}
