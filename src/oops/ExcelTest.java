package oops;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest implements Comparable<ExcelTest>
{
	

	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet1;
	 static int rowTotal;
	 static int columnTotal;
	 static ArrayList<Compare1> arrayExcel;

	 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{
	   ExcelTest excelData=new ExcelTest("C:\\Users\\user\\TestExcel.xlsx");
	    rowTotal=excelData.getRowCount("Test");	
	   System.out.println("Total row count is: " + rowTotal);
	   
	   columnTotal=excelData.getColumnCount("Test");
	   System.out.println("Total column count is: " + columnTotal);
	   
	   arrayExcel=new ArrayList<Compare1>();
       String excel_value = null;	  
	   
	   for(int i=0; i<rowTotal; i++ )
	   {
		   
		   for(int j=0; j<columnTotal; j++)
		   {
			  
			 Cell cell_Value= sheet1.getRow(i).getCell(j);
			 
			 if(cell_Value.getCellType()==Cell.CELL_TYPE_NUMERIC)
			 {
				 
				cell_Value.setCellType(Cell.CELL_TYPE_STRING);
				
			 }
			 
	    excel_value=cell_Value.getStringCellValue();
	   
	    arrayExcel.add(new Compare1(excel_value, excel_value, excel_value));
       }
	      
	   }
	   
	   
	   Collections.sort(arrayExcel);
	   List<Compare1> arrayTest=arrayExcel.stream().distinct().collect(Collectors.toList());
	   
	   for(Compare1 stu:arrayTest)
	   {
		   
		   System.out.println(stu.materialName);
		   System.out.println(stu.Weight);
		   System.out.println(stu.Unit);
		   
	   }
//	   arrayExcel.stream().map(ele->ele).filter(ele->ele.equalsIgnoreCase("new one")).forEach((ele)->System.out.println(ele));
//	   
//	   
//	  // System.out.println(arrayExcel.get(0));
//	   
//	   Iterator<String> itr=arrayExcel.iterator();
//	   while(itr.hasNext())
//	   {
//		    
//			   System.out.println(itr.next());
//			   
//		   
//	   }
	   
	   
	   	   
	}
	
	public ExcelTest(String excelPath) throws Exception
	{
		
		File excel=new File(excelPath);	
		FileInputStream load_excel=new FileInputStream(excel);
		workbook=new XSSFWorkbook(load_excel);	
		workbook.close();
		
	}
	

	 public  int getRowCount(String sheetName)
	   {
	       sheet1 = workbook.getSheet(sheetName);
	       int rowCount = sheet1.getLastRowNum()+1;
	       return rowCount;
	   }
	 
	 public  int getColumnCount(String sheetName)
	   {
	       sheet1 = workbook.getSheet(sheetName);
	       XSSFRow row = sheet1.getRow(0);
	       int colCount = row.getLastCellNum();
	       return colCount;
	   }

	@Override
	public int compareTo(ExcelTest o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
