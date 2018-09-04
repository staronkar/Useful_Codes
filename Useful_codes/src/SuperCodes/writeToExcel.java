package SuperCodes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeToExcel {

	public static void main(String[] args) throws Exception {
		
		String[] data = {"123","674","4524","5452"};
		String[] data1= {"3221","2343","45452","2322"};
		String filePath = "C:\\Users\\ASUS\\Desktop\\newExcel.xls";
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("Result");
//		insertValueInColoumn(0, sheet, data,filePath,wb);
		insertValueInRow(2,sheet,data,filePath,wb);
		
		FileOutputStream fout = new FileOutputStream(filePath);
		wb.write(fout);

//		insertValueInColoumn(4, sheet, data1,filePath,wb);
		insertValueInRow(4,sheet,data1,filePath,wb);
		FileOutputStream fout1 = new FileOutputStream(filePath);
		wb.write(fout1);
	
		System.out.println("End of file");
	}
	
	public static void insertValueInColoumn(int col,Sheet sheet,String[] newData,String filePath,Workbook wb) throws Exception {
		Row row;
		for(int i=1;i<newData.length;i++) {
			
			if(col==0) {
				row = sheet.createRow(i);
			}else {
				row=sheet.getRow(i);
			}
			
			Cell cell=row.createCell(col);
			cell.setCellValue(newData[i]);
			
			}
	}
	
	public static void insertValueInRow(int rowNo,Sheet sheet,String[] newData,String filePath,Workbook wb) {
		Row row=sheet.createRow(rowNo);
		for(int i=0;i<newData.length;i++) {
			Cell cell=row.createCell(i);
			cell.setCellValue(newData[i]);
		
		}
	}

}
