package oops;

public class Firstclass_demo {

	public static void main(String[] args) 
	
	{
	
		System.out.println("-------Program Started------");
		
		Firstclass_demo obj1=new Firstclass_demo();
		
		obj1.sum();
		
		obj1.sub();
		
		Firstclass_demo.mul();
		
		System.out.println("-------Program ended------");
		
	
	}
	
    public void sum()
	
	{
		
		int a= 10;
		
		int b= 20;
		
		int c= a+b;
		
		System.out.println("The sum of value is " + c);
			
	}
	
    public void sub()

	
	{
		
		int x= 10;
		
		int y= 20;
		
		int z=x-y;
		
		System.out.println("The sub of value is " + z);
			
	}
    
    public static void mul()
	
	{
		
		int m= 10;
		
		int n= 20;
		
		int o= m*n;
		
		System.out.println("The Multiply of value is " + o);
			
	}
    
}
