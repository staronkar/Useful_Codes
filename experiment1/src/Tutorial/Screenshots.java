package Tutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshots {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sonyliv.com/");
		TakesScreenshot scr = (TakesScreenshot )driver;
		File SrcFile=scr.getScreenshotAs(OutputType.FILE);

		File DestFile=new File("C:\\Users\\ASUS\\Desktop\\abc.png");
		FileUtils.copyFile(SrcFile, DestFile);

		driver.quit();
		System.out.println("Run Completed");
	}

}
