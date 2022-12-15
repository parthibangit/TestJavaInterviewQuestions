package interviewQuestions;


public class Scanner {

	public static void main(String[] args) 
	{
	
		calc();
		
					    
	}
	
	public static void calc()
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter your CTC:");
		int ctc=scan.nextInt();
		int ctcMonth=0;
		int reduceAmount=5250;
		int variablePay=0;
		
		if(ctc>100000)
		{
		 ctcMonth=ctc/12;
		 variablePay=ctcMonth-reduceAmount;
		 
		 System.out.println("Your CTC per month is: "+ctcMonth+ " Rs/-");
		 System.out.println("Your take home per month is: "+variablePay+ " Rs/-");
		 System.out.println("Reduced amount is: "+reduceAmount+ " Rs/-");

		}
		
		else
		{
			System.out.println("Your amount is less than 10000, So you are not eligible for PF and ESI");
		}
	
		scan.close();

	}	
}
