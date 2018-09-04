package SuperCodes;

import java.io.*;

public class ReadAndWriteText {

	public static void main(String[] args) throws Exception {
		String inputPath ="C:\\Users\\ASUS\\Desktop\\Automation Folder\\Files\\input.txt";
		FileInputStream in = new FileInputStream(inputPath);
		int c;
		while((c= in.read())!=-1)
		{
			System.out.println(c);
		}
		if(in!=null)
		{
			in.close();
		}
		
	}

}
	