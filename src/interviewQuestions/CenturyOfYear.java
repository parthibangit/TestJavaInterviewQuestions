package interviewQuestions;


public class CenturyOfYear {
	
  /*
   Given a year, return the century it is in. 
   The first century spans from the year 1 up to and including the year 100, 
   the second - from the year 101 up to and including the year 200, etc. 
  */
	

	public static void main(String[] args) 
	{

		year(1800);
				
	}

	public static int year(int year)
	{
	
		if(year<=0)
		{
		    System.out.println("Year is not valid");
		}

		else if(year<=100)
		{
			System.out.println("This is 1 century");
		}
		
		else if(year % 100==0)
		{
			System.out.println(year/100+ " Century");
		}
		
		else
		{
			System.out.println(year/100 +1 + " century");
		}
		
		return year;
	}
	
}
