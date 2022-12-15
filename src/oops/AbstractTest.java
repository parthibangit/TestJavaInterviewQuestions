package oops;

public class AbstractTest extends AbstractMethod {

	
	public static void main(String[] args)
	{
		AbstractTest obj=new AbstractTest();
		obj.manual(10, 15);
		obj.automation(12,10);
		obj.test();
		
	}

	@Override
	void manual(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	void automation(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
		
	}

	
}
