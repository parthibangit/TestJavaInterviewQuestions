package oops;

import java.util.Map;

public class HashMap 
{
	
	/*
	 * It is key and value pair to store the elements 
	 * It contains only unique value only
	 * It not maintain the insertion order
	 * 
	 */
	

	public static void main(String[] args) 
	{

		Map<String, String> data_map= new java.util.HashMap<String, String>();
		
		data_map.put("First Name", "Parthiban");
		data_map.put("Last Name", "Subburam");
		data_map.put("Phone Number", "7200412631");
		data_map.put("Mail Id", "Parthiban@siamcomputing.com");
		
		//System.out.println("The map value is " + data_map);
		
		String phone_number=data_map.get("Phone Number");
		System.out.println("Mobile number is " + phone_number);
		System.out.println("");
		System.out.println("All map value is: ");
		
		for( Map.Entry<String, String> data_value:data_map.entrySet())
		{
			
			System.out.println("The key is: "+ data_value.getKey()+" and value is: "+data_value.getValue());
			
		}
		
		System.out.println("");
		System.out.println("After invoking the putIfAbsent method: ");
		
		data_map.putIfAbsent("Address", "Test address");
		data_map.remove("Phone Number");
		
		for(Map.Entry<String, String> afteradd:data_map.entrySet())
		{
			
			System.out.println("The key is: "+ afteradd.getKey()+" and value is: "+afteradd.getValue());
		}
		
	}

}
