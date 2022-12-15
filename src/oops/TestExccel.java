package oops;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExccel {

	public static void main(String[] args) throws Exception
	{
		
		 String pathname="C:\\Users\\user\\writeExcel.xlsx";
         File file=new File(pathname);
         FileInputStream stream=new FileInputStream(file);
         XSSFWorkbook wb=new XSSFWorkbook(stream);
         XSSFSheet sheet=wb.getSheetAt(0);
         wb.close();
         
         String value1= sheet.getRow(1).getCell(0).getStringCellValue();
         Cell value2= sheet.getRow(1).getCell(1);
         Cell value3= sheet.getRow(1).getCell(2);
         
         
         if(value3.getCellType()==Cell.CELL_TYPE_NUMERIC)
         {
        	 value3.setCellType(Cell.CELL_TYPE_STRING);
         }
         
         if(DateUtil.isCellDateFormatted(value2))
         {
        	 value2.getDateCellValue();
         }
         
         String value= value3.getStringCellValue();
         
         
         System.out.println("value is: "+value1);
         System.out.println("DOB is: "+value2);
         System.out.println("Phone number is: "+value);
         
	}

}
