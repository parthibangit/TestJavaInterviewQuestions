package interviewQuestions;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSelect {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// Set up the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Parthiban Sys\\selenium files\\browser drivers\\Chrome New\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Store the output console to text file
		
		
		
		// Element locators
		List<WebElement> listFirstName=driver.findElements(By.xpath("//table[@id='table1']//td[2]"));
		List<WebElement> listEmail=driver.findElements(By.xpath("//table[@id='table1']//td[3]"));
		Map<String, String> map= new TreeMap<String, String>();
		List<String> list=new ArrayList<String>();
		String nameText;
		String emailText;
		System.out.println("FirstName " + "||" + " "+ "Email");
		
		for(int i=0; i<listFirstName.size(); i++)
		{
			nameText=listFirstName.get(i).getText();
			
			for(int j=i; j<listEmail.size(); j++)
			{
				emailText=listEmail.get(j).getText();
				
				if(emailText != null)
				{
					
					System.out.println(nameText + " =====" + "==== " + emailText);
					break;
				}
			}
						
		}
		
	}

}
