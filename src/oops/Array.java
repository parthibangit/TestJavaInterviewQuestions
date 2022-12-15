package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {

	public static void main(String[] args) 
	{
		
	    List<String> al=new ArrayList<String>();
	    al.add("1");
	    al.add("2");
	    al.add("2");
	    
	    Iterator<String> itr=al.iterator();
		
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    al.remove(2);
	    System.out.println("individual data: "+al.get(0));
		

	}

}
