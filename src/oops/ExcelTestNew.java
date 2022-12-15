package oops;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestNew {

	public static void main(String[] args)  throws Exception
	{
		File file=new File("C:\\Users\\user\\TestExcel.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheet("Test");
		wb.close();
		
		Cell cell1=sheet.getRow(1).getCell(1);
		
		if(cell1.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			cell1.setCellType(Cell.CELL_TYPE_STRING);
		}
		System.out.println(cell1);
		

	}

}
