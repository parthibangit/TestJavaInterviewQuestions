package oops;

public class Compare implements Comparable<Compare>
{

	int rollno;
	String name;
	int age;
	
	public Compare(int rollno, String name, int age)
	{
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	

	@Override
	public int compareTo(Compare stu) 
	{
	
		if(age==stu.age)
			return 0;
		else if(age>stu.age)
			return 1;
		else
			return -1;
					
	}
}
