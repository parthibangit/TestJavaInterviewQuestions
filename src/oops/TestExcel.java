package oops;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestExcel 
{

	public static void main(String[] args) throws Exception
	{
		
		System.out.println("========== Test started ==========");
		
		// Get the value from getValue method using key parameter
		System.out.println(getValue("Material Name"));
		System.out.println(getValue("Weight"));
		System.out.println(getValue("Unit"));
		
		System.out.println("========== Test finished ==========");
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static Map<String, Map<String, String>> excelMap() throws Exception
	{
	    // Declare the variable for file path 
		String pathName = "C:\\Users\\user\\TestExcel.xlsx";
		
		// Initiate the file using Apache.poi interface
		File fileObj=new File(pathName);
		FileInputStream inputStream=new FileInputStream(fileObj);
		XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=workBook.getSheetAt(0);
		workBook.close();
		
		// Get the total no of rows and columns
		int rows=sheet.getLastRowNum();
		int columns=sheet.getRow(0).getLastCellNum();
		
		// Declare the hasmap
		Map<String, Map<String, String>> parentMap=new java.util.HashMap<String, Map<String, String>>();
		Map<String, String> childMap=new java.util.HashMap<String, String>();
		
		// Looping to get the datas from excel sheet and map into the hashmap
		for (int i=0; i<rows; i++)
		{
			
			for(int j=0; j<columns; j++)
			{
			    Cell keyCell=sheet.getRow(0).getCell(j);
			    Cell valueCell=sheet.getRow(i+1).getCell(j);
			    
			    if(valueCell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			    {
			    	valueCell.setCellType(Cell.CELL_TYPE_STRING);
			    }
			    
			    String key=keyCell.getStringCellValue();
			    String value=valueCell.getStringCellValue();
			    
			    childMap.put(key, value);
			}
			
			parentMap.put("ParentData", childMap);
		}
		
	   return parentMap;		
	}
	
	
	public static String getValue(String key) throws Exception
	{
		// Call the above function for get the value using key
		Map<String, String> excelData= excelMap().get("ParentData");
		String excelKey=excelData.get(key);
		return excelKey;	
	}
			
}
