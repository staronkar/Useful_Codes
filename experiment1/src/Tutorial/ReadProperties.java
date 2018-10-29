package Tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\experiment1\\src\\Tutorial\\config.properties");
       prop.load(fis);
       
       System.out.println(prop.getProperty("url"));
       System.out.println(prop.getProperty("browser"));
       
	}

}
