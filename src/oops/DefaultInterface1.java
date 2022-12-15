package oops;

public interface DefaultInterface1 
{

	
	default void test1()
	{
		
		System.out.println("This is test 1");
	}
	
	default void test2()
	{
		
		System.out.println("This is test 2");
	}
	
	public void test3();
	
	public static void test4()
	{
		
		System.out.println("This is test 4");
		
	}
	
	
	
}
