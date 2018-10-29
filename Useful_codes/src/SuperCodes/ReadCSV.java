package SuperCodes;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) throws Exception {
	         String csvPath="C:\\Users\\ASUS\\Desktop\\Automation Folder\\Files\\test.csv";	
	         FileReader filereader = new FileReader(csvPath);
	         CSVReader csvReader = new CSVReader(filereader); 
	         String[] nextRecord;
	         while ((nextRecord = csvReader.readNext()) != null) { 
	             for (String cell : nextRecord) { 
	                 System.out.print(cell + "\t"); 
	             } 
	             System.out.println(); 
	         } 
	}

}
