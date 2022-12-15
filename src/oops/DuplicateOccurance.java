package oops;

public class DuplicateOccurance {

	public static void main(String[] args) 
	{
		
		//nonOccurence();
		occurence('e');

	}
	
	
	public static int occurence(char ch)
	{
		
		String name="Selenium Testing";
		char[] array=name.toCharArray();
		
		int index=0;
		int count=0;
		
		while(index<array.length)
		{
			if(name.charAt(index)==ch)
			{
				System.out.println("The character is: "+name.charAt(index));
				count++;
			}
			
			index++;
		}
		
		System.out.println(count);
		return count;
			
	}
	
	public static int nonOccurence()
	{
		
		String name="Selenium Testing";
		String[] array=name.split("");
		
		int index=0;
		int count=0;
		
		while(index<array.length)
		{
			if(name.charAt(index)==name.charAt(index+1))
			{
				System.out.println("The repeated character is: "+name.charAt(index));
				count++;
			}
			
			else
			{
				System.out.println("Non repeated character is"+ name.charAt(index));
			}
			
			index++;
		}
		
		System.out.println(count);
		return count;
			
	}

}
