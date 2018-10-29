package Tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String configPath="C:\\\\Users\\\\ASUS\\\\eclipse-workspace\\\\experiment1\\\\src\\\\Tutorial\\\\config.properties";
		FileInputStream fis = new FileInputStream(configPath);
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath")+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("jsUrl"));
		
		
		driver.quit();
      System.out.println("Run Completed");
	}

}
