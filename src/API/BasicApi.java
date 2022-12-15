package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class BasicApi 
{
	
	
	@Test
	public void test()
	{
		
	    Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	    int status=resp.getStatusCode();
	    long time=resp.getTime();
	    System.out.println(time);
	    System.out.println(status);
		
	}

}
