package oops;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelMap extends excel_con
{

	@Test(dataProvider="Data")
	public void test(Map<String, String> mapData) throws Exception
	{
		
		System.out.println("<========Test started========>");
		
		System.out.println("User Name is: " + mapData.get("User Name"));
		System.out.println("Phone Number is: "+mapData.get("Phone Number"));
		System.out.println("DOB is: "+ mapData.get("DOB"));		
		
		System.out.println("<========Test finished========>");
	}
	
	@DataProvider(name="Data")
	public static Object[][] getExcel() throws Exception 
	{
	
		File obj1=new File("C:\\Users\\user\\writeExcel.xlsx");
		FileInputStream stream=new FileInputStream(obj1);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sheet=wb.getSheetAt(0);
		wb.close();
		int rows=sheet.getLastRowNum();
		int coloumns=sheet.getRow(0).getLastCellNum();
		
		Object[][] dataObject=new Object[rows][1];
		
	
		for(int i=0; i<rows; i++)
		{
		
			Map<String, String> mapData=new java.util.HashMap<String, String>();
        
		    for (int j=0; j<coloumns; j++)
		    {
		
			     Cell keyCell=sheet.getRow(0).getCell(j);
			     Cell valueCell=sheet.getRow(i+1).getCell(j);
			
			     if(valueCell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			       {
				       valueCell.setCellType(Cell.CELL_TYPE_STRING);
				       
//				       if(HSSFDateUtil.isCellDateFormatted(valueCell))
//				       {
//				    	   SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
//				    	   String valueCell=dateFormat.format(valueCell.getDateCellValue());
//				       }
				       				 
			       }
			
			String keyString  = keyCell.getStringCellValue();
			String valueString= valueCell.getStringCellValue();
			mapData.put(keyString, valueString);
			
		}
		dataObject[i][0]=mapData;
		}
	 return dataObject;	
	}	
}