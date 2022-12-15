package oops;

public class Secondclass implements DefaultInterface1

{

	// This ismethod is 
	public void result()
	
	{
		
		DefaultInterface1.super.test1();
		DefaultInterface1.super.test2();
				
	}
	
	public static void main(String[] args)
	{

		Secondclass sc=new Secondclass();
		sc.result();
		sc.test3();
		DefaultInterface1.test4();
		
		
	}

	public void test3() 
	{
		
	    System.out.println("This is test 3");
		
	}
	
		
}
