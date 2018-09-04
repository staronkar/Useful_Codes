package SuperCodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runner {

	public static void main(String[] args) throws Exception {
		String srcFile="C:\\Users\\ASUS\\Desktop\\Automation Folder\\Test Script\\Prakash_Website.xlsx";
		File src = new File(srcFile); 
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		String targetFile="C:\\Users\\ASUS\\Desktop\\Automation Folder\\Test Script\\Prakash_Website_1.xlsx";
		File target = new File(targetFile); 
		FileInputStream fis2 = new FileInputStream(target);
		XSSFWorkbook wb2= new XSSFWorkbook(fis2);
		
		 HashMap<String, String> map1 = new LinkedHashMap<>();
		 HashMap<String, String> map2 = new LinkedHashMap<>();
		
		 ReadFromExcel readObj = new ReadFromExcel();
		ReadFromExcel readObj2 = new ReadFromExcel();
		
		map1= readObj.read(wb, "Script","Test_Case_No","Result");
		map2=readObj2.read(wb2, "Script","Test_Case_No","Result");
		
		readObj.show(srcFile);
		readObj.close(wb);
		
		
		
		readObj2.show(targetFile);
		readObj2.close(wb);
		
	}

}


