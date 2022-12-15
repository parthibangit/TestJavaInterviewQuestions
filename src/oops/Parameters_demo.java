package oops;

public class Parameters_demo {

	public static void main(String[] args) 
	
	{
		
		Parameters_demo obj1=new Parameters_demo();
		
		obj1.add(10, 10);
		
		Parameters_demo.sub(15, 10);
		
		String Getmy_name=Return_demo.Myname("Parthiban", "subburam");
		
		System.out.println("My name is "+Getmy_name);
		
		int total_value=Return_demo.sub(10, 5);
		
		System.out.println("The sub value is " + total_value);
		
	}
	
	public void add(int a,int b )
	
	{
	
		int c= a+b;
		
		System.out.println("The Result of c is " + c);
		
		
	}
	
    public static void sub(int x,int y )
	
	{
	
		int z= x-y;
		
		System.out.println("The Result of z is " + z);
		
		
	}
    
}
