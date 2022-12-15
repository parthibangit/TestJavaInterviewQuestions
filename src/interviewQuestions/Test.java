package interviewQuestions;

import java.util.HashMap;



/**
 * @author Parthiban
 *
 */
public class Test
{

	/**
	 *  This is about the reverse the order
	 */
	
	public static void main(String[] args)
	{
		
		String ele_name  ="Parthiban_@_Subburam_@_Automation Engineer";
		String[] ele_obj = ele_name.split("_@_");
		String[] ele_index = {"first name","last name","des"};
		
		HashMap<String, String> set_obj = new HashMap<String, String>();
		int i = 0;
		for(String arrayValue:ele_obj)	
		{
			set_obj.put(ele_index[i], arrayValue);
			i++;
			
		}
		
		System.out.println("First Name is: "+ set_obj.get("first name"));
		System.out.println("Lat Name is: "+ set_obj.get("last name"));
		System.out.println("designation is: "+ set_obj.get("des"));
		
	}		
}
