package oops;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.collections4.map.AbstractMapDecorator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultiValueMap
{
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("<========Test started========>");
		
		System.out.println(getValue("Unit","kgs"));
		System.out.println(getValue("Weight", "3"));
		
		System.out.println("<========Test finished========>");
		
	}
	

	@SuppressWarnings("deprecation")
	public static org.apache.commons.collections4.map.MultiValueMap<String, String> getExcelValue() throws Exception
	{
		
		File obj1=new File("C:\\Users\\user\\TestExcel3.xlsx");
		FileInputStream stream=new FileInputStream(obj1);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sheet=wb.getSheetAt(0);
		wb.close();
		int rows=sheet.getLastRowNum();
		int coloumns=sheet.getRow(0).getLastCellNum();
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		org.apache.commons.collections4.map.MultiValueMap< String, String> superMap=new org.apache.commons.collections4.map.MultiValueMap();
		//Map<String,List<String>> superMap=new HashMap<String, List<String>>();
		
		for(int i=0; i<rows; i++)
		{
					
		   for (int j=0; j<coloumns; j++)
		    {
			Cell keyCell=sheet.getRow(0).getCell(j);
			Cell valueCell=sheet.getRow(i+1).getCell(j);
			
			if(valueCell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				valueCell.setCellType(Cell.CELL_TYPE_STRING);
			}
			String keyString=keyCell.getStringCellValue();
			String valueString=valueCell.getStringCellValue();
			//childMap.add(valueString);
			superMap.put(keyString, valueString);
		    }
		  
	    }
		 return superMap;	
	}
	
	public static String getValue(String key, String compareValue) throws Exception
	{
		@SuppressWarnings("unchecked")
		Collection<String> values=(Collection<String>) getExcelValue().get(key);
		List<String> listValue=values.stream().filter(X->X.equals(compareValue)).collect(Collectors.toList());
		String stringValue=listValue.get(0);
        return stringValue;	
	}
}