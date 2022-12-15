package oops;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	public static void main(String[] args) 
	
	{
	
		ArrayList<Compare> array=new ArrayList<Compare>();
		
		array.add(new Compare(1000, "Parthiban", 21));
		array.add(new Compare(1001, "Sarathi", 23));
		array.add(new Compare(1002, "Partha sarathi", 24));
	
		Collections.sort(array);
		
		for(Compare stu:array)
		{
			
			System.out.println("Roll no is: " +stu.rollno);
			System.out.println("Name is: " +stu.name);
			System.out.println("Age is:" +stu.age);
			
		}
		
		Encaps data=new Encaps();
		data.setName("Parthi");
		
		
	}

}
