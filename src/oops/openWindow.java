package oops;

import java.util.stream.IntStream;

public class openWindow {

	public static void main(String args[])
	{  
		
		openWindow window=new openWindow();
		window.strinArray();
		boolean b1=true;  
		boolean b2=false;  
		String s1=Boolean.toString(b1);  
		String s2=Boolean.toString(b2);  
		System.out.println(s1);  
		System.out.println(s2);  
		
	}
	
	
	public void strinArray()
	{
		
		String a1="parthi";
		
		char array[]=a1.toCharArray();
		if(array.equals("parthi"))
		{
		System.out.println("Characters are equal");
		}
		
	}
	
	
	
}
