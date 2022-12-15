package oops;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMap {

	
	@Test(dataProvider="data")
	public void test(Map<String, String> data)
	{
		System.out.println("User name is: "+data.get("User Name"));
	}
	
	@DataProvider(name="data")
	public static Object[][] getData() throws Exception
	{
		String patheName="C:\\Users\\user\\writeExcel.xlsx";
		File file=new File(patheName);
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workBook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workBook.getSheetAt(0);
		workBook.close();
		
		int rows=sheet.getLastRowNum();
		int columns=sheet.getRow(0).getLastCellNum();
		
		Object[][] object=new Object[rows][1];
		
		for(int i=0; i<rows; i++)
		{
			
			Map<String, String> getMap=new HashMap<String, String>();
			
			for(int j=0; j<columns; j++)
			{
				Cell key=sheet.getRow(0).getCell(j);
				Cell value=sheet.getRow(i+1).getCell(j);
				
				if(value.getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					value.setCellType(Cell.CELL_TYPE_STRING);
				}
				
				String keydata=key.getStringCellValue();
				String valueData=value.getStringCellValue();
				getMap.put(keydata, valueData);
			}
			
			object[i][0]=getMap;		
		}
	
		return object;
	}
}
