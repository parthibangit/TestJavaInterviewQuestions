package oops;


public class Encaps 
{

	String name;
	int age;
	String phoneNumber;
	
	public String getName()
	{
		return name;
	}
		
	public int getAge()
	{
		return age;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	
	public void setName(String userName)
	{
		name=userName;
	}
	
	public void setAge(int userAge)
	{
		age=userAge;
	}
	
	public void setPhoneNumber(String mob)
	{
		phoneNumber=mob;
	}
	
	
	public static void main(String[] args)
	{
		Encaps obj=new Encaps();
		obj.setName("Parthiban");
		obj.setAge(25);
		obj.setPhoneNumber("7200412631");
		
	    System.out.println("User name is: "+obj.getName());
	    System.out.println("User age is: "+obj.getAge());
	    System.out.println("User mobile number is: "+obj.getPhoneNumber());
		
	}
	
}
