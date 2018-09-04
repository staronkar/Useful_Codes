package SuperCodes;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel
{

	HashMap<String, String> ls = new LinkedHashMap<>();
	public HashMap<String, String> read(XSSFWorkbook wb,String abc,String colomn,String colomn2) throws Exception
	{
		XSSFSheet sheet1= wb.getSheet(abc);
		int lastRow = sheet1.getLastRowNum();
		int lastCol=sheet1.getRow(0).getLastCellNum();
		System.out.println("Last Col is : "+lastCol);
		int count=0;
		int count2=0;

		for(int i=0;i<=7;i++) {
			if( sheet1.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(colomn)) {
				count=i;
				break;
			}
		}
		System.out.println("Value of Test Case No is"+count);

		for(int i=0;i<=lastCol;i++) {
			if( sheet1.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(colomn2)) {
				count2=i;
				break;
			}
		}
		System.out.println("Value of Test Case No is"+count2);


		for(int i=1;i<=lastRow;i++) {

			String temp = sheet1.getRow(i).getCell(count).getStringCellValue();
			String temp2 = sheet1.getRow(i).getCell(count2).getStringCellValue();
			ls.put(temp,temp2);

		}
		return ls;
	}

	public void show(String fileloc) {
		System.out.println("The list for  "+fileloc+" is : "+ls);
	}

	public void close(XSSFWorkbook wb) throws Exception
	{
		wb.close();
	}

}
